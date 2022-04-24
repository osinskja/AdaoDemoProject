package com.example.demo.observer;

public interface ServiceCallObserver {
    void serviceCalled(String operationName, long fileSize);

}
