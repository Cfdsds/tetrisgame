package com.example.tetrisgame;

public class PiecelLLeft extends AllPieces {
    private char[][] piecelleft;
    private int value;
    public PiecelLLeft(){

        piecelleft = new char[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   piecelleft[i][j] = 0;
                }
            }

            piecelleft[3][0] = '*';
            piecelleft[3][1] = '*';
            piecelleft[2][1] = '*';
            piecelleft[1][1] = '*';
          
            value = 1;
    
    }   
}
