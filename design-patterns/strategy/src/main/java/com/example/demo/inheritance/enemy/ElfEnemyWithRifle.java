package com.example.demo.inheritance.enemy;

public class ElfEnemyWithRifle extends Elf {

    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 20 units/s in a straight line.");
    }

}
