package com.example.demo;

import java.util.Objects;

public class DogWithEqualsHashcode {

    private String name;
    private int cuteness;

    public DogWithEqualsHashcode(String name, int cuteness) {
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
        DogWithEqualsHashcode dogWithEqualsHashcode = (DogWithEqualsHashcode) o;
        return cuteness == dogWithEqualsHashcode.cuteness && Objects.equals(name, dogWithEqualsHashcode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cuteness);
    }
}
