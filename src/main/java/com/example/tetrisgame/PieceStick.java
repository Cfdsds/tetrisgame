package com.example.tetrisgame;

public class PieceStick extends PieceBase {
    private char[][] pieceStick;
    private int value;

    public PieceStick(){
        pieceStick = new char[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pieceStick[i][j] = 0;
            }
        }

        pieceStick[0][1] = '*';
        pieceStick[1][1] = '*';
        pieceStick[2][1] = '*';
        pieceStick[3][1] = '*';

        value=1;

    }


}
