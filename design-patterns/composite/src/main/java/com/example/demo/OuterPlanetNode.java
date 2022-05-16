package com.example.demo;

public class OuterPlanetNode implements PlanetNode {

    private int planetDefenseValue;

    public OuterPlanetNode(int planetDefenseValue) {
        this.planetDefenseValue = planetDefenseValue;
    }

    @Override
    public int getPlanetDefenseValue() {
        return planetDefenseValue;
    }
}
