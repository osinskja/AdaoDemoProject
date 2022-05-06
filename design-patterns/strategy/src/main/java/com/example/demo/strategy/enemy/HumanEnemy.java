package com.example.demo.strategy.enemy;

import com.example.demo.strategy.shootingstrategy.ShootingStrategy;

public class HumanEnemy extends Enemy {

    public HumanEnemy(ShootingStrategy shootingStrategy) {
        super(shootingStrategy);
    }

    @Override
    public void display() {
        System.out.println("Display Human on the screen.");
    }
}
