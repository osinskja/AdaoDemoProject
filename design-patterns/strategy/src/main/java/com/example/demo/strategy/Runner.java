package com.example.demo.strategy;

import com.example.demo.strategy.enemy.ElfEnemy;
import com.example.demo.strategy.enemy.Enemy;
import com.example.demo.strategy.enemy.HumanEnemy;
import com.example.demo.strategy.enemy.OrcEnemy;
import com.example.demo.strategy.shootingstrategy.ShootingBowStrategy;
import com.example.demo.strategy.shootingstrategy.ShootingPistolStrategy;
import com.example.demo.strategy.shootingstrategy.ShootingRifleStrategy;

public class Runner {
    public static void main(String[] args) {
        Enemy elfWithRifle = new ElfEnemy(new ShootingRifleStrategy());
        Enemy humanWithRifle = new HumanEnemy(new ShootingRifleStrategy());
        Enemy orcWithPistol = new OrcEnemy(new ShootingPistolStrategy());
        Enemy elfWithBow = new ElfEnemy(new ShootingBowStrategy());

        elfWithRifle.display();
        elfWithRifle.executeShoot();

        humanWithRifle.display();
        humanWithRifle.executeShoot();

        orcWithPistol.display();
        orcWithPistol.executeShoot();

        elfWithBow.display();
        elfWithBow.executeShoot();

    }
}
