package com.example.demo.sftp;

import java.io.File;

public class SftpConnectorImpl implements SftpConnector {
    @Override
    public void sendFileToSftp(File file) {
        System.out.println("Send file " + file.getName() + " to sftp");
    }
}
