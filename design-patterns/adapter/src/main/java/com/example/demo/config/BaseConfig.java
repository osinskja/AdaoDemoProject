package com.example.demo.config;

import com.example.demo.filesystem.LocalFileSystemConnector;
import com.example.demo.filesystem.LocalFileSystemConnectorImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public LocalFileSystemConnector localFileSystemConnector() {
        return new LocalFileSystemConnectorImpl();
    }
}
