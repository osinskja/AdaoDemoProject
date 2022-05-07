package com.example.demo.enemy;

public class UndeadEnemy implements Enemy {
    @Override
    public void display() {
        System.out.println("Display Undead enemy on the screen.");
    }

    @Override
    public void walk() {
        System.out.println("Display Undead enemy walking animation.");
    }
}
