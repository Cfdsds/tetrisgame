package com.example.tetrisgame;

public class PieceStick extends PieceBase {
    private char[][] pieceStick;
    public int orientacion;

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

        orientacion = 1;

    }

    public void rotate_left(){
        switch (orientacion) {
            case 1:
            //**** 
            char[][] pi = new char[4][4];
            pi[0][0]= '*';
            pi[0][1]= '*';
            pi[0][2]= '*';
            pi[0][3]= '*';
            pieceStick = pi;
            orientacion = 2;
                break;
            case 2:
            //  *
            //  *
            //  *
            //  *
                char[][] pd = new char[4][4];
                pd[0][0] = '*';
                pd[0][1] = '*';
                pd[0][2] = '*';
                pd[0][3] = '*';
                pieceStick = pd;
                orientacion = 1;
                break;
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


}
