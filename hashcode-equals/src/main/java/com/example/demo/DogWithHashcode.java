package com.example.demo;

import java.util.Objects;

public class DogWithHashcode {

    private String name;
    private int cuteness;

    public DogWithHashcode(String name, int cuteness) {
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

    @Override
    public int hashCode() {
        return Objects.hash(name, cuteness);
    }
}
