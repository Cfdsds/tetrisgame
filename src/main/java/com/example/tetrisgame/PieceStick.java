package com.example.tetrisgame;

public class PieceStick extends PieceBase {
    private char[][] pieceStick;
    public int orientacion;

    public PieceStick(){
        pieceStick = new char[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pieceStick[i][j] = '.';
            }
        }

        pieceStick[0][0] = '*';
        pieceStick[1][0] = '*';
        pieceStick[2][0] = '*';
        pieceStick[3][0] = '*';

        orientacion = 1;

    }

    public void rotate_left() {
        if (orientacion == 1) {
            char[][] pi = new char[4][4];
            pi[0][0] = '*';
            pi[0][1] = '*';
            pi[0][2] = '*';
            pi[0][3] = '*';
            pieceStick = pi;
            orientacion = 2;
        } else {
            char[][] pd = new char[4][4];
            pd[0][0] = '*';
            pd[1][0] = '*';
            pd[2][0] = '*';
            pd[3][0] = '*';
            pieceStick = pd;
            orientacion = 1;
        }
    }

    public void rotate_right() {
        rotate_left();
    }

    public int getOrientacion(){
        return orientacion;
    }


    public char[][]getPieceStick(){
        return pieceStick;
    }

    @Override
    public char[][] getPieza() {
        return pieceStick;
    }
}
