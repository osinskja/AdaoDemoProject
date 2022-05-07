package com.example.demo;

import org.javatuples.Pair;

public class Runner {
    public static void main(String[] args) {
        GraphicsEditor graphicsEditor = new GraphicsEditor();

        graphicsEditor.executeCommand(new DrawRectangleCommand(graphicsEditor, new Pair<>(0,0), new Pair<>(1,1)));
        graphicsEditor.executeCommand(new DrawRectangleCommand(graphicsEditor, new Pair<>(2,2), new Pair<>(3,3)));

        graphicsEditor.unExecuteCommand();
        graphicsEditor.unExecuteCommand();
    }
}
