package com.example.demo;

import com.example.demo.enemy.Enemy;
import com.example.demo.obstacles.Obstacle;

public interface GameObjectFactory {

    Obstacle getObstacle(int progress);

    Enemy getEnemy(int progress);

}
