package com.example.demo;

public class Dog {

    private String name;
    private int cuteness;

    public Dog(String name, int cuteness) {
        this.name = name;
        this.cuteness = cuteness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuteness() {
        return cuteness;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

}
