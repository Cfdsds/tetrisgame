package com.example.tetrisgame;

public class Board {
    //tablero de 10x20
    public char[][] tablero;
    public int xRandom;
    public int yRandom;

    public Board() {
        tablero = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
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
        return new PieceSquare(/* parámetros para una pieza cuadrada */);
    }


    public void addPieces(PieceBase piezaR) {
        PieceBase piezaRand = piezaRandom();  

        piezaRand.setX(4); 
        piezaRand.setY(0);  
           
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



