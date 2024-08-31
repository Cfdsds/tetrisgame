package com.example.tetrisgame;

public class PieceLRight extends AllPieces {
    private char[][] piecelright;
    private int value;
    public PieceLRight(){

        piecelright = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecelright[i][j] = 0;
                }
            }

            piecelright[0][0] = '*';
            piecelright[1][0] = '*';
            piecelright[2][0] = '*';
            piecelright[2][1] = '*';
        
            value = 1;
    }   
}
