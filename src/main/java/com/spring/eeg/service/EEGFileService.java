package com.spring.eeg.service;

import com.spring.eeg.Dao.EegFileListDao;
import com.spring.eeg.Model.EEGData;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import com.spring.eeg.utils.DateUtil;
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

import static com.spring.eeg.utils.ConstValues.EEG_FILE_PATH;

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
    private void writeToDisk(List<EEGData> list,String path) throws IOException {
        File file = new File(path);
        if(file.exists()){
            throw new IOException("File Exist 文件存在了");
        }
        OutputStream outputStream = new FileOutputStream(file);
        PrintStream printStream = new PrintStream(outputStream);
        Iterator<EEGData> iterator = list.iterator();
        while (iterator.hasNext()) {
            EEGData eegData = iterator.next();
            printStream.print(eegData.getOrigin());
            if(iterator.hasNext()){
                printStream.println();
            }
        }
        printStream.close();
        outputStream.close();
    }

    private Map<String, Integer> analysis(List<EEGData>list){
        Map<String,Integer> map = new HashMap<>();
        Integer timeS = list.size() / 512;// 512 HZ
        Iterator<EEGData> iterator = list.iterator();
        Integer poorTime = 0;
        Integer attentionTime = 0;
        while (iterator.hasNext()) {
            EEGData eegData = iterator.next();
            if(eegData.getPoorSignal() < 50){
                if(eegData.getAttention() >= 40){
                    attentionTime++;
                }
            }else{
                poorTime++;
            }
        }
        attentionTime = attentionTime / 512;
        poorTime = poorTime / 512;
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
        if(eegFile.length==0) {
            return null;
        }
        Map<String,Object> fileResult = new HashMap<>();
        LocalDate parse = LocalDate.parse(uploadDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Date date = DateUtil.toUtilDate(parse);

        // 1.得到信息
        List<EEGData> transform = eegDataTransform.transform(eegFile[0]);
        Map<String, Integer> analysis = analysis(transform);
        Integer attentionTimeS = analysis.get("attentionTimeS");
        Integer totalTimeS = analysis.get("timeS");
        // 2.写入文件
        String path = EEG_FILE_PATH +"f_"+fileTitle + "_u_" + uploadDate +"_p_" +planId +".csv";
        try {
            writeToDisk(transform,path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(planId!=-1){
            // 3.添加到planid
            planService.addPlanTime(attentionTimeS/60,planId);
        }
        // 4.添加到学习记录
        eegStatisticService.addLearnStateTime(userId,attentionTimeS,totalTimeS,date);
        // 5. 添加FileList
        addEEGFileList(path,info,totalTimeS/60,attentionTimeS/60,fileTitle,date,planId,userId);
        // 6.更新上周学习计划?
        eegStatisticService.upDateLastWeekState(userId);
        // 7.得到回显
        fileResult.putAll(analysis);
        Eegfilelist eegfilelist = getFileByPath(path);
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
}
