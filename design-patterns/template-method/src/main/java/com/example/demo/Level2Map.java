package com.example.demo;

import org.javatuples.Pair;

public class Level2Map extends Map {

    @Override
    protected double getObstaclesIntensity() {
        return 0.4;
    }

    @Override
    protected Pair<Integer,Integer> getMapSize() {
        return new Pair<>(200,200);
    }

    @Override
    protected Pair<Integer,Integer> getCastleStartingPosition() {
        return new Pair<>(10,10);
    }

    @Override
    protected void placeEnemies() {
        System.out.println("Placing enemies at specific locations.");
    }
}
