package com.example.demo;

import com.example.demo.enemy.Enemy;
import com.example.demo.obstacles.Obstacle;

public class Runner {
    public static void main(String[] args) {
        GameObjectFactory gameObjectFactorySwamp = new GameObjectFactorySwamp();

        Obstacle obstacle1 = gameObjectFactorySwamp.getObstacle(0);
        Enemy enemy1 = gameObjectFactorySwamp.getEnemy(0);
        Obstacle obstacle2 = gameObjectFactorySwamp.getObstacle(90);
        Enemy enemy2 = gameObjectFactorySwamp.getEnemy(90);

        obstacle1.display();
        enemy1.display();
        obstacle2.display();
        enemy2.display();

        GameObjectFactory gameObjectFactoryTropical = new GameObjectFactoryTropical();

        Obstacle obstacle3 = gameObjectFactoryTropical.getObstacle(0);
        Enemy enemy3 = gameObjectFactoryTropical.getEnemy(0);
        Obstacle obstacle4 = gameObjectFactoryTropical.getObstacle(90);
        Enemy enemy4 = gameObjectFactoryTropical.getEnemy(90);

        obstacle3.display();
        enemy3.display();
        obstacle4.display();
        enemy4.display();
    }
}
