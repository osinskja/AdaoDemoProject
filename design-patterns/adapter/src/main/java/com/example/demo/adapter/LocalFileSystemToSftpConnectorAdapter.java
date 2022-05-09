package com.example.demo.adapter;

import com.example.demo.filesystem.LocalFileSystemConnector;
import com.example.demo.sftp.SftpConnector;

import java.io.File;

public class LocalFileSystemToSftpConnectorAdapter implements LocalFileSystemConnector {

    private SftpConnector sftpConnector;

    public LocalFileSystemToSftpConnectorAdapter(SftpConnector sftpConnector) {
        this.sftpConnector = sftpConnector;
    }

    @Override
    public void sendFile(File file) {
        sftpConnector.sendFileToSftp(file);
    }
}
