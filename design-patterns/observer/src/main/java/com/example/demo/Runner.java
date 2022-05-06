package com.example.demo;

import com.example.demo.config.BaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import({BaseConfig.class})
public class Runner {
    public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);

      GameManager gameManager = context.getBean(GameManager.class);
      EnemySpawnService enemySpawnService = context.getBean(EnemySpawnService.class);
      ObstacleSpawnService obstacleSpawnService = context.getBean(ObstacleSpawnService.class);

      gameManager.setLevel(1);
      gameManager.setWeatherConditions(Weather.SUMMER);

      enemySpawnService.spawnEnemies();
      obstacleSpawnService.spawnObstacles();

      gameManager.setLevel(1);
      gameManager.setWeatherConditions(Weather.WINTER);

      enemySpawnService.spawnEnemies();
      obstacleSpawnService.spawnObstacles();

      gameManager.setLevel(2);
      gameManager.setWeatherConditions(Weather.WINTER);

      enemySpawnService.spawnEnemies();
      obstacleSpawnService.spawnObstacles();
    }
}
