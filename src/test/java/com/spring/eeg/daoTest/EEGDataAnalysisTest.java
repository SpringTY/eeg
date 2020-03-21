package com.spring.eeg.daoTest;


import com.spring.eeg.Dao.ArticleDao;
import com.spring.eeg.analysis.EEGBean;
import com.spring.eeg.analysis.EEGDataAnalysis;
import com.spring.eeg.mbg.model.Articleview;
import joinery.DataFrame;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;
import java.util.Scanner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EEGDataAnalysisTest {
    @Autowired
    EEGDataAnalysis eegDataAnalysis;
    @Test
    public void contextLoads() throws IOException {
        File file = new File("EEGFile/eegIDRecord.csv");
//        InputStream inputStream = new FileInputStream(file);
//        Scanner in = new Scanner(inputStream);
//        while(in.hasNext()){
//            System.out.println(in.nextLine());
//        }
        DataFrame<Object> dataFrame = DataFrame.readCsv("EEGFile/eegIDRecord.csv");
        System.out.println(dataFrame.describe());
//        dataFrame
    }
}
