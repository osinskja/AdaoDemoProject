package com.example.demo.enemy;

public class WildBoarEnemy implements Enemy {
    @Override
    public void display() {
        System.out.println("Display Wild Boar enemy on the screen.");
    }

    @Override
    public void walk() {
        System.out.println("Display Wild Boar enemy walking animation.");
    }

}
