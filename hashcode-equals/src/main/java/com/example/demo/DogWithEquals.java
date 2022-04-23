package com.example.demo;

import java.util.Objects;

public class DogWithEquals {

    private String name;
    private int cuteness;

    public DogWithEquals(String name, int cuteness) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogWithEquals dog = (DogWithEquals) o;
        return cuteness == dog.cuteness && Objects.equals(name, dog.name);
    }

}
