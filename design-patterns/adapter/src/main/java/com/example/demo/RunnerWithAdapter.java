package com.example.demo;

import com.example.demo.config.BaseConfigWithAdapter;
import com.example.demo.filesystem.LocalFileSystemConnector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import java.io.File;

@Import({BaseConfigWithAdapter.class})
public class RunnerWithAdapter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RunnerWithAdapter.class);

        LocalFileSystemConnector localFileSystemConnector = context.getBean(LocalFileSystemConnector.class);

        File file = new File("/path/file.txt");
        localFileSystemConnector.sendFile(file);
    }
}
