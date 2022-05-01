package com.example.demo.connector.company;

import com.example.demo.common.BaseSftpConnector;
import com.example.demo.common.SftpFileUploader;
import org.springframework.beans.factory.ObjectProvider;

public class IntegrationCompanySftpConnectorImpl extends BaseSftpConnector implements IntegrationCompanySftpConnector {

    public IntegrationCompanySftpConnectorImpl(ObjectProvider<SftpFileUploader> sftpFileUploader) {
        super(sftpFileUploader, "data/files/company/");
    }
}
