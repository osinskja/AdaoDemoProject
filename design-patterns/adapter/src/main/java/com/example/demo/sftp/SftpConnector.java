package com.example.demo.sftp;

import java.io.File;

public interface SftpConnector {
    void sendFileToSftp(File file);
}
