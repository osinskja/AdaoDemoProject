package com.example.demo.connector.person;

import com.example.demo.common.BaseSftpConnector;
import com.example.demo.common.SftpFileUploader;

public class IntegrationPersonSftpConnectorImpl extends BaseSftpConnector implements IntegrationPersonSftpConnector {

    public IntegrationPersonSftpConnectorImpl(SftpFileUploader sftpFileUploader) {
        super(sftpFileUploader);
    }
}
