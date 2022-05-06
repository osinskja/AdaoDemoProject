package com.example.demo.enemy;

public class InBloodEnemyDecorator implements Enemy {

    private Enemy enemy;

    public InBloodEnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void display() {
        enemy.display();
        System.out.println("Display Blood around enemy.");
    }
}
