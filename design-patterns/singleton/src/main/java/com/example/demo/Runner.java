package com.example.demo;

public class Runner {
    public static void main(String[] args) {

        GameManager gameManager = GameManager.getInstance();
        System.out.println("Level: " + gameManager.getLevel() + " Progress: " + gameManager.getProgress());

        gameManager.setLevel(2);
        gameManager.setProgress(100);

        gameManager = GameManager.getInstance();
        System.out.println("Level: " + gameManager.getLevel() + " Progress: " + gameManager.getProgress());
    }
}
