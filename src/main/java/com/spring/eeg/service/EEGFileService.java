package com.spring.eeg.service;

import com.spring.eeg.Dao.EegFileListDao;
import com.spring.eeg.Model.EEGData;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import com.spring.eeg.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

import static com.spring.eeg.utils.ConstValues.EEG_FILE_PATH;
@Slf4j
@Service
public class EEGFileService {
    @Autowired
    EegfilelistMapper eegfilelistMapper;
    @Autowired
    PlanService planService;
    @Autowired
    @Qualifier(value = "EEGIDAppFileTransform")
    RowEEGDataTransform eegDataTransform;
    @Autowired
    EEGStatisticService eegStatisticService;
    /**
     *
     * @param userId
     * @return
     */
    private List<Eegfilelist> getCurrentFileList(Integer userId) {
        EegfilelistExample eegfilelistExample = new EegfilelistExample();
        EegfilelistExample.Criteria criteria = eegfilelistExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Eegfilelist> eegFileList = eegfilelistMapper.selectByExample(eegfilelistExample);
        return eegFileList;
    }

    public List<Eegfilelist> getCurrentFileList(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return getCurrentFileList(user.getUserid());
    }
    private Map<String,Integer> writeToDisk(String path,MultipartFile multipartFile) throws IOException {
        File file = new File(path);
        if(file.exists()){
            throw new IOException("File Exist 文件存在了");
        }
        HashMap<String,Integer> map = new HashMap<>();
        InputStream inputStream = multipartFile.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        Scanner scanner = new Scanner(bufferedInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        PrintStream printStream = new PrintStream(bufferedOutputStream);
        if(scanner.hasNext()){
            scanner.nextLine();
        }
        int cnt = 0;
        Integer attentionTimeS = 0;
        Integer totalTimeS = 0;
        while(scanner.hasNext()){
            cnt++;
            if(cnt == 511){
                cnt = 0;
                EEGData transform = eegDataTransform.transform(scanner.nextLine());
                printStream.println(transform.getAttention());
                totalTimeS+=1;
                attentionTimeS+=(transform.getAttention()>40)?1:0;
            }else{
                scanner.nextLine();
            }
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        fileOutputStream.close();
        map.put("attentionTimeS",attentionTimeS);
        map.put("totalTimeS",totalTimeS);
        return map;
    }

    private Map<String, Integer> analysis(List<EEGData>list){
        Map<String,Integer> map = new HashMap<>();
        Integer timeS = list.size() / 512;// 512 HZ
        Iterator<EEGData> iterator = list.iterator();
        Integer poorTime = 0;
        Integer attentionTime = 0;
        Integer attentionZeroToTwenty = 0;
        Integer attentionTwentyToForty = 0;
        Integer attentionFortyToSixty = 0;
        Integer attentionSixtyToEighty = 0;
        Integer attentionEightToFull = 0;
        while (iterator.hasNext()) {
            EEGData eegData = iterator.next();
            if(eegData.getPoorSignal() < 50){
                if(eegData.getAttention()<20){
                    attentionZeroToTwenty++;
                }else if (eegData.getAttention() <40){
                    attentionTwentyToForty++;
                }else if (eegData.getAttention() <60){
                    attentionFortyToSixty++;
                }else if (eegData.getAttention() <80){
                    attentionSixtyToEighty++;
                }else if (eegData.getAttention() <=100){
                    attentionEightToFull++;
                }
                if(eegData.getAttention() >= 40){
                    attentionTime++;
                }
            }else{
                poorTime++;
            }
        }
        attentionTime = attentionTime / 512;
        poorTime = poorTime / 512;
        attentionZeroToTwenty = attentionZeroToTwenty / 512;
        attentionTwentyToForty = attentionTwentyToForty / 512;
        attentionFortyToSixty = attentionFortyToSixty / 512;
        attentionSixtyToEighty = attentionSixtyToEighty / 512;
        attentionEightToFull = attentionEightToFull / 512;

        map.put("attentionZeroToTwenty",attentionZeroToTwenty);
        map.put("attentionTwentyToForty",attentionTwentyToForty);
        map.put("attentionFortyToSixty",attentionFortyToSixty);
        map.put("attentionSixtyToEighty",attentionSixtyToEighty);
        map.put("attentionEightToFull",attentionEightToFull);

        map.put("timeS",timeS);
        map.put("poorTimeS",poorTime);
        map.put("attentionTimeS",attentionTime);
        return map;
    }
    private void addEEGFileList(String path,String info,Integer totalTime,Integer attentionTime,String fileTitle,Date date,Integer planId,Integer userId){
        Eegfilelist eegfilelist = new Eegfilelist();
        eegfilelist.setAnalysised(1);
        eegfilelist.setFilepath(path);
        eegfilelist.setInfo(info);
        eegfilelist.setTotaltime(totalTime);
        eegfilelist.setAttentiontime(attentionTime);
        eegfilelist.setNote(fileTitle);
        eegfilelist.setUploaddate(date);
        eegfilelist.setPlanid(planId);
        eegfilelist.setUserid(userId);
        eegfilelistMapper.insert(eegfilelist);
    }
    @Transactional
    public Integer analysis(Integer planId,Integer userId, String fileTitle, String uploadDate, String info, MultipartFile[] eegFile) {
        log.info("userid:"+userId);
        if(eegFile.length==0) {
            return null;
        }
        Map<String,Object> fileResult = new HashMap<>();
        LocalDate parse = LocalDate.parse(uploadDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Date date = DateUtil.toUtilDate(parse);

        log.info("1.得到信息");
        log.info("2.写入文件");
        // 2.写入文件
        String path = EEG_FILE_PATH +"f_"+fileTitle + "_u_" + uploadDate +"_p_" +planId +".csv";
        Map<String,Integer> map = null;
        try {
            map = writeToDisk(path,eegFile[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer attentionTimeS = map.get("attentionTimeS");
        Integer totalTimeS = map.get("totalTimeS");
        log.info("3.添加到planid");
        if(planId!=-1){
            // 3.添加到planid
            planService.addPlanTime(attentionTimeS/60,planId);
        }
        log.info("4.添加到学习记录");
        // 4.添加到学习记录
        eegStatisticService.addLearnStateTime(userId,attentionTimeS/60,totalTimeS/60,date);
        log.info("5. 添加FileList");
        // 5. 添加FileList
        addEEGFileList(path,info,totalTimeS/60,attentionTimeS/60,fileTitle,date,planId,userId);
        log.info("6.更新上周学习计划?");
        // 6.更新上周学习计划?
        eegStatisticService.upDateLastWeekState(userId);
        // 7.得到回显
        Eegfilelist eegfilelist = getFileByPath(path);
        log.info("完成");
        return eegfilelist.getFileid();
    }

    private Eegfilelist getFileByPath(String path) {
        EegfilelistExample eegfilelistExample = new EegfilelistExample();
        EegfilelistExample.Criteria criteria = eegfilelistExample.createCriteria();
        criteria.andFilepathEqualTo(path);
        List<Eegfilelist> eegFileLists = eegfilelistMapper.selectByExample(eegfilelistExample);
        if(eegFileLists.size()==0) return null;
        return eegFileLists.get(0);
    }

    public boolean getFileInfo(Integer eegFileId, Map<String, Object> map) {
        Eegfilelist eegfilelist = eegfilelistMapper.selectByPrimaryKey(eegFileId);
        if(eegfilelist == null){
            return false;
        }
        File file = new File(eegfilelist.getFilepath());
        Map<String, Object> analysis = analysisAfterTransform(file);
        map.putAll(analysis);
        map.put("eegFileInfo",eegfilelist);
        return true;
    }

    private Map<String, Object> analysisAfterTransform(File file) {
        Map<String, Object>  map = new HashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String thisLine = null;
        List<Integer> attentionList = new LinkedList<>();
        Integer attention = null;
        Integer totalTime = 0;
        Integer attentionTime = 0;
        Integer attentionZeroToTwenty = 0;
        Integer attentionTwentyToForty = 0;
        Integer attentionFortyToSixty = 0;
        Integer attentionSixtyToEighty = 0;
        Integer attentionEightToFull = 0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while((thisLine=bufferedReader.readLine())!=null){
                if(thisLine.equals("")){
                    continue;
                }
                attention = Integer.parseInt(thisLine);
                attentionList.add(attention);
                totalTime++;
                if(attention>40){
                    attentionTime++;//单位是s
                }
                if(attention < 20){
                    attentionZeroToTwenty++;
                }else if (attention < 40){
                    attentionTwentyToForty++;
                }else if (attention < 60){
                    attentionFortyToSixty++;
                }else if (attention < 80){
                    attentionSixtyToEighty++;
                }else {
                    attentionEightToFull++;
                }
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        map.put("attentionZeroToTwenty",attentionZeroToTwenty);
        map.put("attentionTwentyToForty",attentionTwentyToForty);
        map.put("attentionFortyToSixty",attentionFortyToSixty);
        map.put("attentionSixtyToEighty",attentionSixtyToEighty);
        map.put("attentionEightToFull",attentionEightToFull);
        map.put("attentionTime",attentionTime);
        map.put("totalTime",totalTime);
        map.put("attentionList",attentionList);
        return map;
    }

}
