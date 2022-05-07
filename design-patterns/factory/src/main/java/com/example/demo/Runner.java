package com.example.demo;

import com.example.demo.factory.ObstacleFactory;
import com.example.demo.obstacles.Obstacle;

public class Runner {
    public static void main(String[] args) {
        ObstacleFactory obstacleFactory = new ObstacleFactory();
        Obstacle obstacle1 = obstacleFactory.getObstacle(0, Environment.MOUNTAIN);
        Obstacle obstacle2 = obstacleFactory.getObstacle(90, Environment.MOUNTAIN);

        obstacle1.display();
        obstacle2.display();

        Obstacle obstacle3 = obstacleFactory.getObstacle(0, Environment.TROPICAL);
        Obstacle obstacle4 = obstacleFactory.getObstacle(90, Environment.TROPICAL);

        obstacle3.display();
        obstacle4.display();
    }
}
