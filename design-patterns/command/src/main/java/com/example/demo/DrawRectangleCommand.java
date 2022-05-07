package com.example.demo;

import org.javatuples.Pair;

public class DrawRectangleCommand implements Command {

    private final GraphicsEditor graphicsEditor;

    private final Pair<Integer, Integer> startDrawingPointOnCanvas;
    private final Pair<Integer, Integer> endDrawingPointOnCanvas;

    public DrawRectangleCommand(GraphicsEditor graphicsEditor,
                                Pair<Integer, Integer> startDrawingPointOnCanvas,
                                Pair<Integer, Integer> endDrawingPointOnCanvas) {
        this.graphicsEditor = graphicsEditor;
        this.startDrawingPointOnCanvas = startDrawingPointOnCanvas;
        this.endDrawingPointOnCanvas = endDrawingPointOnCanvas;
    }

    @Override
    public void execute() {
        if (startDrawingPointOnCanvas != null && endDrawingPointOnCanvas != null) {
            graphicsEditor.drawLineOnCanvas(startDrawingPointOnCanvas, new Pair<>(endDrawingPointOnCanvas.getValue0(), startDrawingPointOnCanvas.getValue1()));
            graphicsEditor.drawLineOnCanvas(endDrawingPointOnCanvas, new Pair<>(endDrawingPointOnCanvas.getValue0(), startDrawingPointOnCanvas.getValue1()));
            graphicsEditor.drawLineOnCanvas(endDrawingPointOnCanvas, new Pair<>(startDrawingPointOnCanvas.getValue0(), endDrawingPointOnCanvas.getValue1()));
            graphicsEditor.drawLineOnCanvas(startDrawingPointOnCanvas, new Pair<>(startDrawingPointOnCanvas.getValue0(), endDrawingPointOnCanvas.getValue1()));
        }
    }

    @Override
    public void unexecute() {
        if (startDrawingPointOnCanvas != null && endDrawingPointOnCanvas != null) {
            graphicsEditor.eraseLineFromCanvas(startDrawingPointOnCanvas, new Pair<>(endDrawingPointOnCanvas.getValue0(), startDrawingPointOnCanvas.getValue1()));
            graphicsEditor.eraseLineFromCanvas(endDrawingPointOnCanvas, new Pair<>(endDrawingPointOnCanvas.getValue0(), startDrawingPointOnCanvas.getValue1()));
            graphicsEditor.eraseLineFromCanvas(endDrawingPointOnCanvas, new Pair<>(startDrawingPointOnCanvas.getValue0(), endDrawingPointOnCanvas.getValue1()));
            graphicsEditor.eraseLineFromCanvas(startDrawingPointOnCanvas, new Pair<>(startDrawingPointOnCanvas.getValue0(), endDrawingPointOnCanvas.getValue1()));
        }
    }
}
