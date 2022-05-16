package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class InnerPlanetNode implements PlanetNode {

    private int planetDefenseValue;
    private List<PlanetNode> neighbourPlanetNodes = new ArrayList<>();

    public InnerPlanetNode(int planetDefenseValue) {
        this.planetDefenseValue = planetDefenseValue;
    }

    @Override
    public int getPlanetDefenseValue() {
        int defenseValue = this.planetDefenseValue;
        for (PlanetNode neighbourPlanetNode : neighbourPlanetNodes) {
            defenseValue += neighbourPlanetNode.getPlanetDefenseValue();
        }
        return defenseValue;
    }

    public List<PlanetNode> getNeighbourPlanetNodes() {
        return neighbourPlanetNodes;
    }
}
