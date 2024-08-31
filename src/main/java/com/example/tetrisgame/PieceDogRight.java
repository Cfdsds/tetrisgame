package com.example.tetrisgame;

public class PieceDogRight extends AllPieces {
    private char[][] pieceDogR;
    private int value;
    public PieceDogRight(){

        pieceDogR = new char[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   pieceDogR[i][j] = 0;
                }
            }

            pieceDogR[2][0] = '*';
            pieceDogR[2][1] = '*';
            pieceDogR[1][1] = '*';
            pieceDogR[1][2] = '*';
          
            value = 1;
    
    }  
}
