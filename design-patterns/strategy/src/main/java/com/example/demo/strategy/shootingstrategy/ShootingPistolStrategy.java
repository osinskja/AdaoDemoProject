package com.example.demo.strategy.shootingstrategy;

public class ShootingPistolStrategy implements ShootingStrategy {
    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 10 units/s in a straight line.");
    }
}
