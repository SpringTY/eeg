package com.spring.eeg.service;

import com.jcraft.jsch.*;
import com.spring.eeg.config.SshConfiguration;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Service
public class RemoteFileService implements FileService {
    private ChannelSftp channelSftp;
    private ChannelExec channelExec;
    private Session session=null;
    private int timeout=60000;
    private String localCachePath ="articles";
    public RemoteFileService(){
    }
    @Override
    public void upload(String localPath, String remotePath) {
        try {

            channelSftp=(ChannelSftp) session.openChannel("sftp");
            channelSftp.connect();
            channelSftp.rm(remotePath);
            channelSftp.put(localPath, remotePath);
            channelSftp.quit();
        } catch (JSchException | SftpException e) {
            e.printStackTrace();
        }
    }

    @Override
    public File download(String path) {
        return null;
    }

    @Override
    public String getText(String path) {
        return null;
    }
}
