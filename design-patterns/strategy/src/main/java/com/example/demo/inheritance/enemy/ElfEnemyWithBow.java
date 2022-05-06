package com.example.demo.inheritance.enemy;

public class ElfEnemyWithBow extends Elf {

    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 5 units/s in a curved line.");
    }

}
