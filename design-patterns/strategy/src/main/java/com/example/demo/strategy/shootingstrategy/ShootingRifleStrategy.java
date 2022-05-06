package com.example.demo.strategy.shootingstrategy;

public class ShootingRifleStrategy implements ShootingStrategy {
    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 20 units/s in a straight line.");
    }
}
