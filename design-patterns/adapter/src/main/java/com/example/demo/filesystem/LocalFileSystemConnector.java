package com.example.demo.filesystem;

import java.io.File;

public interface LocalFileSystemConnector {
    void sendFile(File file);
}
