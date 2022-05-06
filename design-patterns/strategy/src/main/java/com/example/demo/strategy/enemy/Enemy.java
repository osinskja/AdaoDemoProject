package com.example.demo.strategy.enemy;

import com.example.demo.strategy.shootingstrategy.ShootingStrategy;

public abstract class Enemy {

    ShootingStrategy shootingStrategy;

    public Enemy(ShootingStrategy shootingStrategy) {
        this.shootingStrategy = shootingStrategy;
    }

    public void executeShoot() {
        shootingStrategy.shoot();
    }

    abstract public void display();
}
