package com.example.demo.factory;

import com.example.demo.Environment;
import com.example.demo.obstacles.*;

public class ObstacleFactory {

    public Obstacle getObstacle(int progress, Environment environment) {
        if(Environment.MOUNTAIN.equals(environment) && progress <= 50) {
            return new Tree();
        } else if(Environment.MOUNTAIN.equals(environment)) {
            return new Mountain();
        } else if(Environment.TROPICAL.equals(environment) && progress <= 50) {
            return new Tree();
        } else if(Environment.TROPICAL.equals(environment)) {
            return new Swamp();
        }
        return null;
    }

}
