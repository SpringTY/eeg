package com.spring.eeg.service;

import com.spring.eeg.Model.EEGData;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Service
public class EEGIDAppFileTransform implements RowEEGDataTransform {
    @Override
    public EEGData transform(String row) {
        String[] fields = row.split(",");
        EEGData eegData = new EEGData();
        eegData.setTimeStampMs(Double.valueOf(fields[0]));
        eegData.setPoorSignal(Integer.valueOf(fields[1]));
        eegData.setEegRawValue(Integer.valueOf(fields[2]));
        eegData.setEegRawVolt(Double.valueOf(fields[3]));
        eegData.setAttention(Integer.valueOf(fields[4]));
        eegData.setBlinkStrength(Integer.valueOf(fields[5]));
        eegData.setMeditation(Integer.valueOf(fields[6]));
        eegData.setDelta(Integer.valueOf(fields[7]));
        eegData.setTheta(Integer.valueOf(fields[8]));
        eegData.setAlphaLow(Integer.valueOf(fields[9]));
        eegData.setAlphaHigh(Integer.valueOf(fields[10]));
        eegData.setBetaLow(Integer.valueOf(fields[11]));
        eegData.setBetaHigh(Integer.valueOf(fields[12]));
        eegData.setGammaLow(Integer.valueOf(fields[13]));
        eegData.setGammaMid(Integer.valueOf(fields[14]));
        eegData.setOrigin(row);
        return eegData;
    }

    /**
     * 512hz采样文件
     * @param multipartFile
     * @return
     */
    @Override
    public List<EEGData> transform(MultipartFile multipartFile)   {
        List<EEGData> result = new LinkedList<>();
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        Scanner scanner = null;
        try {
            inputStream = multipartFile.getInputStream();
             bufferedInputStream = new BufferedInputStream(inputStream);
             scanner = new Scanner(bufferedInputStream);
            if(scanner.hasNext()){
                scanner.nextLine();
            }
            EEGData eegData = null;
            int cnt = 0;
            while (scanner.hasNext()){
                cnt++;
                if(cnt == 511){
                    cnt=0;
                    eegData = this.transform(scanner.nextLine());
                    result.add(eegData);
                }
            }
            scanner.close();
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 1hz文件
     * @param file
     * @return
     */
    @Override
    public List<EEGData> transform(File file){
        List<EEGData> result = new LinkedList<>();
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        Scanner scanner = null;
        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            scanner = new Scanner(bufferedInputStream);
            if(scanner.hasNext()){
                scanner.nextLine();
            }
            EEGData eegData = null;
            while (scanner.hasNext()){
                eegData = this.transform(scanner.nextLine());
                result.add(eegData);
            }
            scanner.close();
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
