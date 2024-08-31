package com.example.tetrisgame;

public class PieceDogLeft extends AllPieces {
    private char[][] pieceDogL;
    private int value;
    public PieceDogLeft(){

        pieceDogL = new char[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   pieceDogL[i][j] = 0;
                }
            }

            pieceDogL[1][0] = '*';
            pieceDogL[1][1] = '*';
            pieceDogL[2][1] = '*';
            pieceDogL[2][2] = '*';
          
            value = 1;
    
    }  
}
