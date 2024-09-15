package com.example.tetrisgame;

public class Tetris extends Clock {
    public Board board;
    int filasCompletadas;

    public Tetris() {
        board = new Board();
        Clock c1 = new Clock();
        this.filasCompletadas = 0;
    }

    public static void ganar() {
        //
    }

    public static void perder() {
        //
    }
}
