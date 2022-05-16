package com.example.demo;


public class Runner {
    public static void main(String[] args) {
        InnerPlanetNode innerPlanetNode1 = new InnerPlanetNode(2);
        InnerPlanetNode innerPlanetNode2 = new InnerPlanetNode(2);

        OuterPlanetNode outerPlanetNode1 = new OuterPlanetNode(1);
        OuterPlanetNode outerPlanetNode2 = new OuterPlanetNode(1);
        OuterPlanetNode outerPlanetNode3 = new OuterPlanetNode(1);

        innerPlanetNode1.getNeighbourPlanetNodes().add(innerPlanetNode2);
        innerPlanetNode1.getNeighbourPlanetNodes().add(outerPlanetNode1);

        innerPlanetNode2.getNeighbourPlanetNodes().add(outerPlanetNode2);
        innerPlanetNode2.getNeighbourPlanetNodes().add(outerPlanetNode3);

        System.out.println("InnerPlanetNode1 defense value: " + innerPlanetNode1.getPlanetDefenseValue());
        System.out.println("InnerPlanetNode2 defense value: " + innerPlanetNode2.getPlanetDefenseValue());
    }
}
