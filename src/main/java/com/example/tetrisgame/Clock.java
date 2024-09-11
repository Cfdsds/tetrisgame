package com.example.tetrisgame;

public class Clock {
    private int ticCont = 0;
    private Board board;

    public Clock(Board board) {
        this.board = board;
    }

    public int getTick() {
        return ticCont;
    }

    public void tic() {
        ticCont++;
        // Llamar al método bajarPieza del tablero
        board.bajarPieza(board.piezaActual);
    }
}

