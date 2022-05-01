package com.example.demo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SftpFileUploaderSingletonConfig {
    @Bean
    public SftpFileUploader sftpFileUploader(String sftpDirectory) {
        return new SftpFileUploader(sftpDirectory);
    }

}
