package com.example.demo;

import org.javatuples.Pair;
import java.util.Stack;

public class GraphicsEditor {

    private final Stack<Command> commandsHistory = new Stack<>();

    public void drawLineOnCanvas(Pair<Integer,Integer> startCoordinates, Pair<Integer,Integer> endCoordinates) {
        System.out.println("Drawing line on canvas starting at: " + startCoordinates + " and finishing at: " + endCoordinates);
    }

    public void eraseLineFromCanvas(Pair<Integer,Integer> startCoordinates, Pair<Integer,Integer> endCoordinates) {
        System.out.println("Erasing line on canvas starting at: " + startCoordinates + " and finishing at: " + endCoordinates);
    }

    public void executeCommand(Command command) {
        commandsHistory.add(command);
        command.execute();
    }

    public void unExecuteCommand() {
        Command command = commandsHistory.pop();
        command.unexecute();
    }
}
