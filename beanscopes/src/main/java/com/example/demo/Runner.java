package com.example.demo;

import com.example.demo.common.BaseConfig;
import com.example.demo.connector.company.IntegrationCompanySftpConnector;
import com.example.demo.connector.person.IntegrationPersonSftpConnector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import({BaseConfig.class})
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);

        IntegrationCompanySftpConnector integrationCompanySftpConnector = context.getBean(IntegrationCompanySftpConnector.class);

        integrationCompanySftpConnector.uploadFile();
        integrationCompanySftpConnector.downloadFile();

        IntegrationPersonSftpConnector integrationPersonSftpConnector = context.getBean(IntegrationPersonSftpConnector.class);

        integrationPersonSftpConnector.uploadFile();
        integrationPersonSftpConnector.downloadFile();
    }
}
