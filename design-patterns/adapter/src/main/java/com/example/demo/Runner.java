package com.example.demo;

import com.example.demo.adapter.LocalFileSystemToSftpConnectorAdapter;
import com.example.demo.config.BaseConfig;
import com.example.demo.filesystem.LocalFileSystemConnector;
import com.example.demo.filesystem.LocalFileSystemConnectorImpl;
import com.example.demo.sftp.SftpConnectorImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import java.io.File;

@Import({BaseConfig.class})
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);

        LocalFileSystemConnector localFileSystemConnector = context.getBean(LocalFileSystemConnector.class);

        File file = new File("/path/file.txt");
        localFileSystemConnector.sendFile(file);
    }
}
