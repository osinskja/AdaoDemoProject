package com.example.demo.common;

public class SftpFileUploader {

    private String sftpDirectory;

    public SftpFileUploader(String sftpDirectory) {
        this.sftpDirectory = sftpDirectory;
    }

    public void uploadToSftp() {
        System.out.println("Uploading file to " + sftpDirectory);
    }

    public void downloadFromSftp() {
        System.out.println("Downloading file from " + sftpDirectory);
    }

}
