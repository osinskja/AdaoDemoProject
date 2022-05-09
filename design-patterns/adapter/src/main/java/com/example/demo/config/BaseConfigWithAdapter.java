package com.example.demo.config;

import com.example.demo.adapter.LocalFileSystemToSftpConnectorAdapter;
import com.example.demo.filesystem.LocalFileSystemConnector;
import com.example.demo.filesystem.LocalFileSystemConnectorImpl;
import com.example.demo.sftp.SftpConnector;
import com.example.demo.sftp.SftpConnectorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfigWithAdapter {

    @Bean
    public LocalFileSystemConnector localFileSystemConnector(SftpConnector sftpConnector) {
        return new LocalFileSystemToSftpConnectorAdapter(sftpConnector);
    }

    @Bean
    public SftpConnector sftpConnector() {
        return new SftpConnectorImpl();
    }
}
