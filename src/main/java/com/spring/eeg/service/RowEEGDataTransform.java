package com.spring.eeg.service;

import com.spring.eeg.Model.EEGData;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface RowEEGDataTransform {
    public EEGData transform(String row);
    public List<EEGData> transform(MultipartFile multipartFile)  ;
}
