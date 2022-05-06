package com.example.demo.inheritance.enemy;

public class HumanEnemyWithRifle extends Human {

    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 20 units/s in a straight line.");
    }
}
