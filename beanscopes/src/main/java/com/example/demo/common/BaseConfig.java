package com.example.demo.common;

import com.example.demo.connector.company.IntegrationCompanySftpConnector;
import com.example.demo.connector.company.IntegrationCompanySftpConnectorImpl;
import com.example.demo.connector.person.IntegrationPersonSftpConnector;
import com.example.demo.connector.person.IntegrationPersonSftpConnectorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configuration
public class BaseConfig {
    @Bean
    @Scope(scopeName = SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
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
