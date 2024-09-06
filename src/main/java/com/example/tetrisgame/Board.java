package com.example.tetrisgame;

import java.util.Random;

public class Board {
    //tablero de 10x20
    public char[][] tablero;
    public int xRandom;
    public int yRandom;

    public Board() {
        tablero = new char[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    public char[][] getBoard() {
        return tablero;
    }

    public PieceBase piezaRandom() {
        Random random = new Random();
        int tipoPieza = random.nextInt(6); // Cambia el rango según el número de piezas
        switch(tipoPieza) {
            case 0:
                return new PieceStick();
            case 1:
                return new PieceSquare();
            case 2:
                return new PieceDogLeft();
            case 3:
                return new PieceDogRight();
            case 4:
                return new PieceLLeft();
            case 5:
                return new PieceLRight();
            case 6:
                return new PieceT();       
        }
        return null;
    }    

    public void addPieces(PieceBase piezaR) {
        PieceBase piezaRand = piezaR; // Usa la pieza pasada como argumento
     
        piezaRand.setX(0); // Establece la posición inicial para la prueba
        piezaRand.setY(0);
     
        char[][] pieza = piezaRand.getPieza(); // Usa getPieza()
        int posX = piezaRand.getX();
        int posY = piezaRand.getY();
     
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + j;
                    int boardY = posY + i;
                    if (boardX >= 0 && boardX < tablero[0].length && boardY >= 0 && boardY < tablero.length) {
                        tablero[boardY][boardX] = pieza[i][j];
                    }
                }
            }
        }
    }
    
    

    
}



