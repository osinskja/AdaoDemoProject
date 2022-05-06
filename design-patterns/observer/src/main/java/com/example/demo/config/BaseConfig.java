package com.example.demo.config;

import com.example.demo.EnemySpawnService;
import com.example.demo.GameManager;
import com.example.demo.ObstacleSpawnService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public GameManager gameManager() {
        return new GameManager();
    }

    @Bean
    public EnemySpawnService enemySpawnService(GameManager gameManager) {
        return new EnemySpawnService(gameManager);
    }

    @Bean
    public ObstacleSpawnService obstacleSpawnService(GameManager gameManager) {
        return new ObstacleSpawnService(gameManager);
    }
}
