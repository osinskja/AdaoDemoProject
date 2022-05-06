package com.example.demo.observer;

public interface Observable {
    void add(Observer observer);

    void notifyAllObservers();

}
