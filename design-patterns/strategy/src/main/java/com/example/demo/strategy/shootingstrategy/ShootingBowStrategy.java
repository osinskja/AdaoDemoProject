package com.example.demo.strategy.shootingstrategy;

public class ShootingBowStrategy implements ShootingStrategy {
    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 5 units/s in a curved line.");
    }
}
