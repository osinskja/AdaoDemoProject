package com.example.demo.enemy;

public class MounainLionEnemy implements Enemy {

    @Override
    public void display() {
        System.out.println("Display Mounain Lion enemy on the screen.");
    }

    @Override
    public void walk() {
        System.out.println("Display Mounain Lion enemy walking animation.");
    }

}
