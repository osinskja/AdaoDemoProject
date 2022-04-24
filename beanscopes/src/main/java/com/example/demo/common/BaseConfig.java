package com.example.demo.common;

import com.example.demo.connector.company.IntegrationCompanySftpConnector;
import com.example.demo.connector.company.IntegrationCompanySftpConnectorImpl;
import com.example.demo.connector.person.IntegrationPersonSftpConnector;
import com.example.demo.connector.person.IntegrationPersonSftpConnectorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
    @Bean
    public SftpFileUploader sftpFileUploader() {
        return new SftpFileUploader();
    }

    @Bean
    public IntegrationCompanySftpConnector integrationCompanySftpConnector(SftpFileUploader sftpFileUploader) {
        return new IntegrationCompanySftpConnectorImpl(sftpFileUploader);
    }

    @Bean
    public IntegrationPersonSftpConnector integrationPersonSftpConnector(SftpFileUploader sftpFileUploader) {
        return new IntegrationPersonSftpConnectorImpl(sftpFileUploader);
    }
}
