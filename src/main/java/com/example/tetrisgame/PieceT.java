package com.example.tetrisgame;

public class PieceT extends AllPieces {
    private char[][] piecet;
    private int value;
    public PieceT(){

        piecet = new char[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   piecet[i][j] = 0;
                }
            }

            piecet[3][0] = '*';
            piecet[3][1] = '*';
            piecet[3][2] = '*';
            piecet[2][1] = '*';
          
            value = 1;
    
    }   
}