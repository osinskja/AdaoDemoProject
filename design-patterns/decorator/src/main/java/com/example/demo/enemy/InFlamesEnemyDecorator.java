package com.example.demo.enemy;

public class InFlamesEnemyDecorator implements Enemy {

    private Enemy enemy;

    public InFlamesEnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void display() {
        enemy.display();
        System.out.println("Display Flames around enemy.");
    }
}
