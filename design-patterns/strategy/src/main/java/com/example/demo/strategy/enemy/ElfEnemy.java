package com.example.demo.strategy.enemy;

import com.example.demo.strategy.shootingstrategy.ShootingStrategy;

public class ElfEnemy extends Enemy {

    public ElfEnemy(ShootingStrategy shootingStrategy) {
        super(shootingStrategy);
    }

    @Override
    public void display() {
        System.out.println("Display Elf on the screen.");
    }
}
