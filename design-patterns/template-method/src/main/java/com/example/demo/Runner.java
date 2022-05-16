package com.example.demo;

public class Runner {
    public static void main(String[] args) {
      Map level1Map = new Level1Map();
      Map level2Map = new Level2Map();

      level1Map.generateMap();
      level2Map.generateMap();

    }
}
