package com.example.demo;

import com.example.demo.observer.Observer;

public class ObstacleSpawnService implements Observer {

    private int obstaclesHeightMultiplier = 1;

    private int obstaclesSlipperyMultiplier = 1;

    private final GameManager gameManager;

    public ObstacleSpawnService(GameManager gameManager) {
        this.gameManager = gameManager;
        this.gameManager.add(this);
    }

    public void spawnObstacles() {
        System.out.println("Spawning obstacle with height multiplier " + obstaclesHeightMultiplier + " and slippery multiplier " + obstaclesSlipperyMultiplier);
    }

    @Override
    public void update() {
        obstaclesHeightMultiplier = gameManager.getLevel();
        obstaclesSlipperyMultiplier = (gameManager.getWeatherConditions().equals(Weather.WINTER) ? 2 : 1);
    }
}
