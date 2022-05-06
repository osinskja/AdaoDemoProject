package com.example.demo;


import com.example.demo.enemy.*;

public class Runner {
    public static void main(String[] args) {
        Enemy undeadEnemy = new UndeadEnemy();
        Enemy undeadEnemyInFlames = new InFlamesEnemyDecorator(new UndeadEnemy());
        Enemy undeadEnemyInFlamesInBlood = new InBloodEnemyDecorator(new InFlamesEnemyDecorator(new UndeadEnemy()));
        Enemy robotEnemyInFlames = new InFlamesEnemyDecorator(new RobotEnemy());

        undeadEnemy.display();
        undeadEnemyInFlames.display();
        undeadEnemyInFlamesInBlood.display();
        robotEnemyInFlames.display();
    }
}
