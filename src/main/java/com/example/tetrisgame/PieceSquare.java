package com.example.tetrisgame;

public class PieceSquare extends AllPieces{
    private char[][] pieceSquare;
    private int value;

    public PieceSquare(){
        pieceSquare = new char[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pieceSquare[i][j] = 0;
            }
        }

        pieceSquare[0][0] = '*';
        pieceSquare[0][1] = '*';
        pieceSquare[1][0] = '*';
        pieceSquare[1][1] = '*';

        value=1;
    }
}
