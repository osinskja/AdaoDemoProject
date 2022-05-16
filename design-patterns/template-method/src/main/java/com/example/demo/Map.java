package com.example.demo;

import org.javatuples.Pair;

public abstract class Map {

    public void generateMap() {
        System.out.println("Generating random map with parameters: map size = " + getMapSize() + " obstacles intensity = " + getObstaclesIntensity() + " castle starting position = " + getCastleStartingPosition());
        placeEnemies();
    }

    protected double getObstaclesIntensity() {
        return 0.6;
    }

    protected Pair<Integer,Integer> getMapSize() {
        return new Pair<>(100,100);
    }

    protected Pair<Integer,Integer> getCastleStartingPosition() {
        return new Pair<>(0,0);
    }

    protected void placeEnemies() {
        System.out.println("Placing enemies randomly.");
    }


}
