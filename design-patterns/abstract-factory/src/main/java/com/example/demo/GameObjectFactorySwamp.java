package com.example.demo;

import com.example.demo.enemy.Enemy;
import com.example.demo.enemy.GolemEnemy;
import com.example.demo.enemy.UndeadEnemy;
import com.example.demo.obstacles.Obstacle;
import com.example.demo.obstacles.Swamp;
import com.example.demo.obstacles.Tree;

public class GameObjectFactorySwamp implements GameObjectFactory {

    @Override
    public Obstacle getObstacle(int progress) {
        if( progress <= 50) {
            return new Tree();
        } else {
            return new Swamp();
        }
    }

    @Override
    public Enemy getEnemy(int progress) {
        if( progress <= 50) {
            return new UndeadEnemy();
        } else {
            return new GolemEnemy();
        }
    }

}
