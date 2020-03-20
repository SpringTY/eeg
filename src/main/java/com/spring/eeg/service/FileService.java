package com.spring.eeg.service;

import java.io.File;

public interface FileService {
    void upload(String localPath,String remotePath);
    File download(String path);
    String getText(String path);
}
