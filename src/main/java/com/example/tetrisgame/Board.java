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

    public void setBoard(int x, int y) {
        tablero[x][y] = '*';
    }

    public PieceBase piezaRandom() {
        Random random = new Random();
        int tipoPieza = random.nextInt(5); // Cambia el rango según el número de piezas

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
            default:
                return new PieceT();
            
        }
    }


    public void addPieces(){
        PieceBase piezaRand = piezaRandom();  

        piezaRand.setX(4); 
        piezaRand.setY(0);  
           
        // Obtiene la forma de la pieza
        char[][] pieza = piezaRand.getPieza();
        int posX = piezaRand.getX();
        int posY = piezaRand.getY();

        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') { // Si la celda no está vacía
                    int boardX = posX + j;
                    int boardY = posY + i;

                // Verifica si la celda está dentro del tablero
                if (boardX >= 0 && boardX < tablero[0].length && boardY >= 0 && boardY < tablero.length) {
                    tablero[boardY][boardX] = pieza[i][j];
                } else {
                    System.err.println("La pieza se sale del tablero en la posición (" + boardX + ", " + boardY + ")");
                }
            }
        }
    }
    }

    
    
}



