package com.example.demo.common;

public class BaseSftpConnector implements SimpleSftpConnector {

    private SftpFileUploader sftpFileUploader;

    public BaseSftpConnector(SftpFileUploader sftpFileUploader) {
        this.sftpFileUploader = sftpFileUploader;
        this.sftpFileUploader.registerObserver(this::serviceCalled);
    }

    @Override
    public void uploadFile() {
        sftpFileUploader.uploadToSftp();
    }

    @Override
    public void downloadFile() {
        sftpFileUploader.downloadFromSftp();
    }

    private void serviceCalled(String operationName, long fileSize) {
        System.out.println("Saving to logs operation on file: " + operationName + fileSize);
    }
}
