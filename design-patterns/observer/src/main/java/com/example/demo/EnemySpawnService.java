package com.example.demo;

import com.example.demo.observer.Observer;

public class EnemySpawnService implements Observer {

    private int enemiesPowerMultiplier = 1;

    private final GameManager gameManager;

    public EnemySpawnService(GameManager gameManager) {
        this.gameManager = gameManager;
        this.gameManager.add(this);
    }

    public void spawnEnemies() {
        System.out.println("Spawning enemy with power multiplier " + enemiesPowerMultiplier);
    }

    @Override
    public void update() {
        enemiesPowerMultiplier = gameManager.getLevel() + (gameManager.getWeatherConditions().equals(Weather.SUMMER) ? 0 : 1);
    }
}
