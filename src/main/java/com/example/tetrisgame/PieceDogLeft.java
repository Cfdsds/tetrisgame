package com.example.tetrisgame;

public class PieceDogLeft extends PieceBase {
    private char[][] pieceDogL;
    private int orientacion;
    public PieceDogLeft(){

        pieceDogL = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   pieceDogL[i][j] = 0;
                }
            }

            pieceDogL[0][0] = '*';
            pieceDogL[0][1] = '*';
            pieceDogL[1][1] = '*';
            pieceDogL[1][2] = '*';
          
            orientacion = 1;
    
    }
    
    public void rotate_left(){
        switch(orientacion){
        case 1://izquierda y derecha
        //  *
        // **
        // *
            char[][] pdLi = new char[3][3];
            pdLi[0][1]= '*';
            pdLi[1][1]= '*';
            pdLi[1][2]= '*';
            pdLi[2][2]= '*';
            pieceDogL = pdLi;
            orientacion = 2;
            break;

        case 2://abajo y arriba
        // **
        //  **
            char[][] pdRa = new char[3][3];
            pdRa[0][1] = '*';
            pdRa[0][2] = '*';
            pdRa[1][0] = '*';
            pdRa[1][1] = '*';
            pieceDogL = pdRa;
            orientacion = 1;
            break;     
        }
    }
}