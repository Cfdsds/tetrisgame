package com.example.tetrisgame;

public class PieceLRight extends AllPieces {
    private char[][] piecelright;
    private int value;
    public PieceLRight(){

        piecelright = new char[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   piecelright[i][j] = 0;
                }
            }

            piecelright[1][0] = '*';
            piecelright[2][0] = '*';
            piecelright[3][0] = '*';
            piecelright[3][1] = '*';
          
            value = 1;
    }   
}
