package com.example.demo;

import com.example.demo.enemy.*;
import com.example.demo.obstacles.Mountain;
import com.example.demo.obstacles.Obstacle;
import com.example.demo.obstacles.Swamp;
import com.example.demo.obstacles.Tree;

public class GameObjectFactoryTropical implements GameObjectFactory {

    @Override
    public Obstacle getObstacle(int progress) {
        if( progress <= 50) {
            return new Tree();
        } else {
            return new Mountain();
        }
    }

    @Override
    public Enemy getEnemy(int progress) {
        if(progress <= 50) {
            return new WildBoarEnemy();
        } else {
            return new MounainLionEnemy();
        }
    }

}
