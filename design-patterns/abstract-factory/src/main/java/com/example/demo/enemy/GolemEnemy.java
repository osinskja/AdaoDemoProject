package com.example.demo.enemy;

public class GolemEnemy implements Enemy {
    @Override
    public void display() {
        System.out.println("Display Golem enemy on the screen.");
    }

    @Override
    public void walk() {
        System.out.println("Display Golem enemy walking animation.");
    }
}
