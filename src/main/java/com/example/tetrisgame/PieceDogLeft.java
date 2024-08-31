package com.example.tetrisgame;

public class PieceDogLeft extends PieceBase {
    private char[][] pieceDogL;
    private int value;
    public PieceDogLeft(){

        pieceDogL = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   pieceDogL[i][j] = 0;
                }
            }

            pieceDogL[0][0] = '*';
            pieceDogL[0][1] = '*';
            pieceDogL[1][1] = '*';
            pieceDogL[1][2] = '*';
          
            value = 1;
    
    }  
}
