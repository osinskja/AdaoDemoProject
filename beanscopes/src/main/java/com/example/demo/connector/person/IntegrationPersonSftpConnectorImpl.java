package com.example.demo.connector.person;

import com.example.demo.common.BaseSftpConnector;
import com.example.demo.common.SftpFileUploader;
import org.springframework.beans.factory.ObjectProvider;

public class IntegrationPersonSftpConnectorImpl extends BaseSftpConnector implements IntegrationPersonSftpConnector {

    public IntegrationPersonSftpConnectorImpl(ObjectProvider<SftpFileUploader> sftpFileUploader) {
        super(sftpFileUploader,"data/files/person/");
    }
}
