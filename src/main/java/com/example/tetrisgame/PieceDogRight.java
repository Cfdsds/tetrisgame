package com.example.tetrisgame;

public class PieceDogRight extends AllPieces {
    private char[][] pieceDogR;
    private int value;
    public PieceDogRight(){

        pieceDogR = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   pieceDogR[i][j] = 0;
                }
            }

            pieceDogR[0][1] = '*';
            pieceDogR[0][2] = '*';
            pieceDogR[1][0] = '*';
            pieceDogR[1][1] = '*';
          
            value = 1;
    
    }  
}
