package com.example.tetrisgame;

public class PieceSquare extends PieceBase{
    private char[][] pieceSquare;

    public PieceSquare(){
        pieceSquare = new char[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pieceSquare[i][j] = '.';
            }
        }

        pieceSquare[0][0] = '*';
        pieceSquare[0][1] = '*';
        pieceSquare[1][0] = '*';
        pieceSquare[1][1] = '*';

        setOrientacion(1);
    }

    public void rotate_left(){
        char[][] si = new char[4][4];
        si[0][0]= '*';
        si[0][1]= '*';
        si[1][0]= '*';
        si[1][1]= '*';
        pieceSquare = si;
        setOrientacion(2);
    }

    public void rotate_right(){
        rotate_left();
    }
    
   
    public int getOrientacion(){
        return orientacion;
    }
        
    public char[][]getPieceSquare(){
        return pieceSquare;
    }

    @Override
    public char[][] getPieza() {
        return pieceSquare;
    }
}
