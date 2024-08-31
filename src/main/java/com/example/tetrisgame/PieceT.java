package com.example.tetrisgame;

public class PieceT extends PieceBase {
    private char[][] piecet;
    private int value;
    public PieceT(){

        piecet = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecet[i][j] = 0;
                }
            }

            piecet[1][0] = '*';
            piecet[1][1] = '*';
            piecet[1][2] = '*';
            piecet[0][1] = '*';
            
          
            value = 1;
    
    }   
}