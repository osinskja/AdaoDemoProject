package com.example.demo.common;

import org.springframework.beans.factory.ObjectProvider;

public abstract class BaseSftpConnector implements SimpleSftpConnector {

    private SftpFileUploader sftpFileUploader;

    public BaseSftpConnector(ObjectProvider<SftpFileUploader> sftpFileUploader, String sftpDirectory) {
        this.sftpFileUploader = sftpFileUploader.getObject(sftpDirectory);
    }

    @Override
    public void uploadFile() {
        sftpFileUploader.uploadToSftp();
    }

    @Override
    public void downloadFile() {
        sftpFileUploader.downloadFromSftp();
    }
}
