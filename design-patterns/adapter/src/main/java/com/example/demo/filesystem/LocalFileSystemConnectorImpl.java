package com.example.demo.filesystem;

import java.io.File;

public class LocalFileSystemConnectorImpl implements LocalFileSystemConnector {
    @Override
    public void sendFile(File file) {
        System.out.println("Sending file " + file.getName() + " to local filesystem");
    }
}
