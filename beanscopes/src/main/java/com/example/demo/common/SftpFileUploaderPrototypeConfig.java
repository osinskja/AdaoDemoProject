package com.example.demo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configuration
public class SftpFileUploaderPrototypeConfig {
    @Bean
    @Scope(scopeName = SCOPE_PROTOTYPE)
    public SftpFileUploader sftpFileUploader(String sftpDirectory) {
        return new SftpFileUploader(sftpDirectory);
    }

}
