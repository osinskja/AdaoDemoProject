package com.example.demo;

import com.example.demo.observer.Observable;
import com.example.demo.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements Observable {
    private List<Observer> observers = new ArrayList<>();

    private int level = 1;

    private Weather weatherConditions = Weather.SUMMER;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        notifyAllObservers();
    }

    public Weather getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(Weather weatherConditions) {
        this.weatherConditions = weatherConditions;
        notifyAllObservers();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
