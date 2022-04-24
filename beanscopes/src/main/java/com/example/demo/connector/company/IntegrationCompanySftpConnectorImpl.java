package com.example.demo.connector.company;

import com.example.demo.common.BaseSftpConnector;
import com.example.demo.common.SftpFileUploader;

public class IntegrationCompanySftpConnectorImpl extends BaseSftpConnector implements IntegrationCompanySftpConnector {

    public IntegrationCompanySftpConnectorImpl(SftpFileUploader sftpFileUploader) {
        super(sftpFileUploader);
    }
}
