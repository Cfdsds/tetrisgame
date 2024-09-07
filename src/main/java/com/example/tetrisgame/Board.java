package com.example.tetrisgame;

import java.util.Random;

public class Board {
    //tablero de 10x20
    public char[][] tablero;

    public Board() {
        tablero = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    public char[][] getBoard() {
        return tablero;
    }

    public PieceBase piezaRandom() {
        Random random = new Random();
        int tipoPieza = random.nextInt(7); // Cambia el rango según el número de piezas
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

    //public PieceBase rotarPieza(//piezaRandom) {
       


    public void addPieces(PieceBase piezaR) {
        Random random = new Random();
        
        // Calcula el máximo valor para Y (columnas)
        int maxY = tablero[0].length - piezaR.getPieza()[0].length;
        int randomY = random.nextInt(maxY + 1); // Genera una posición Y aleatoria
        int fixedX = 0; // X siempre será 0 para que la pieza aparezca en la primera fila
        
        piezaR.setX(fixedX); // Establece X en 0 (fila)
        piezaR.setY(randomY); // Establece Y en posición aleatoria (columna)
        
        char[][] pieza = piezaR.getPieza(); // Obtiene la matriz de la pieza
        int posX = piezaR.getX(); // Fila
        int posY = piezaR.getY(); // Columna
        
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i; // Fila en el tablero
                    int boardY = posY + j; // Columna en el tablero
                    if (boardX >= 0 && boardX < tablero[0].length && boardY >= 0 && boardY < tablero.length) {
                        tablero[boardX][boardY] = pieza[i][j];
                    }
                }
            }
        }
    }
    
    
    
    
}



