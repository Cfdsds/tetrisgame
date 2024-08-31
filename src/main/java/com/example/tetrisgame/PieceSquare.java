package com.example.tetrisgame;

public class PieceSquare extends AllPieces{
    private char[][] pieceSquare;
    private int value;

    public PieceSquare(){
        pieceSquare = new char[1][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pieceSquare[i][j] = 0;
            }
        }

        pieceSquare[1][1] = '*';
        pieceSquare[1][2] = '*';
        pieceSquare[2][1] = '*';
        pieceSquare[2][2] = '*';

        value=1;
    }
}
