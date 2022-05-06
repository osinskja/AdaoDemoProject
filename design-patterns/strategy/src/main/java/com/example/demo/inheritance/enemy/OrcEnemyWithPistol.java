package com.example.demo.inheritance.enemy;

public class OrcEnemyWithPistol extends Orc {

    @Override
    public void shoot() {
        System.out.println("Shoot at a speed of 10 units/s in a straight line.");
    }

}
