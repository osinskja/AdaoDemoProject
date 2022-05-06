package com.example.demo.strategy.enemy;

import com.example.demo.strategy.shootingstrategy.ShootingStrategy;

public class OrcEnemy extends Enemy {

    public OrcEnemy(ShootingStrategy shootingStrategy) {
        super(shootingStrategy);
    }

    @Override
    public void display() {
        System.out.println("Display Orc on the screen.");
    }

}
