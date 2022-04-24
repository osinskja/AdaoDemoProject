package com.example.demo.common;

import com.example.demo.observer.ServiceCallObserver;

import java.util.ArrayList;
import java.util.List;

public class SftpFileUploader {

    private List<ServiceCallObserver> observers = new ArrayList<>();

    public void uploadToSftp() {
        System.out.println("Uploading file");
        observers.forEach(observer -> observer.serviceCalled("upload", 2));
    }

    public void downloadFromSftp() {
        System.out.println("Downloading file");
        observers.forEach(observer -> observer.serviceCalled("download", 3));
    }


    public void registerObserver(ServiceCallObserver serviceCallObserver) {
        this.observers.add(serviceCallObserver);
    }
}
