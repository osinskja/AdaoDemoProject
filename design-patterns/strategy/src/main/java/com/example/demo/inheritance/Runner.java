package com.example.demo.inheritance;

import com.example.demo.inheritance.enemy.*;

public class Runner {
    public static void main(String[] args) {
        Enemy elfWithRifle = new ElfEnemyWithRifle();
        Enemy humanWithRifle = new HumanEnemyWithRifle();
        Enemy orcWithPistol = new OrcEnemyWithPistol();
        Enemy elfWithBow = new ElfEnemyWithBow();

        elfWithRifle.display();
        elfWithRifle.shoot();

        humanWithRifle.display();
        humanWithRifle.shoot();

        orcWithPistol.display();
        orcWithPistol.shoot();

        elfWithBow.display();
        elfWithBow.shoot();

    }
}
