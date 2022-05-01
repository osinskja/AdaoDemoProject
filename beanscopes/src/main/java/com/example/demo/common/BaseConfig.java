package com.example.demo.common;

import com.example.demo.connector.company.IntegrationCompanySftpConnector;
import com.example.demo.connector.company.IntegrationCompanySftpConnectorImpl;
import com.example.demo.connector.person.IntegrationPersonSftpConnector;
import com.example.demo.connector.person.IntegrationPersonSftpConnectorImpl;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public IntegrationCompanySftpConnector integrationCompanySftpConnector(ObjectProvider<SftpFileUploader> sftpFileUploader) {
        return new IntegrationCompanySftpConnectorImpl(sftpFileUploader);
    }

    @Bean
    public IntegrationPersonSftpConnector integrationPersonSftpConnector(ObjectProvider<SftpFileUploader> sftpFileUploader) {
        return new IntegrationPersonSftpConnectorImpl(sftpFileUploader);
    }
}
