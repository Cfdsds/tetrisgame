package com.example.tetrisgame;

public class PiecelLLeft extends PieceBase {
    private char[][] piecelleft;
    private int value;
    public PiecelLLeft(){

        piecelleft = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecelleft[i][j] = 0;
                }
            }

            piecelleft[2][0] = '*';
            piecelleft[2][1] = '*';
            piecelleft[1][1] = '*';
            piecelleft[0][1] = '*';
            
          
            value = 1;
    
    }   
}
