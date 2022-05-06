package com.example.demo.inheritance.enemy;

public abstract class Human implements Enemy {

    @Override
    public void display() {
        System.out.println("Display Human on the screen.");
    }

}
