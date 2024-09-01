package com.example.tetrisgame;

public class PieceDogRight extends PieceBase {
    private char[][] pieceDogR;
    private int orientacion;
    public PieceDogRight(){

        pieceDogR = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   pieceDogR[i][j] = 0;
                }
            }

            pieceDogR[0][1] = '*';
            pieceDogR[0][2] = '*';
            pieceDogR[1][0] = '*';
            pieceDogR[1][1] = '*';
          
            orientacion = 1;
    
    } 
    
    public void rotate_left(){
        switch(orientacion){
        case 1://izquierda y derecha
        // *
        // **
        //  *
            char[][] pdRi = new char[3][3];
            pdRi[0][1]= '*';
            pdRi[1][1]= '*';
            pdRi[1][2]= '*';
            pdRi[2][2]= '*';
            pieceDogR = pdRi;
            orientacion = 2;
            break;
        case 2://abajo y arriba
        //  **
        // **
            char[][] pdRa = new char[3][3];
            pdRa[0][1] = '*';
            pdRa[0][2] = '*';
            pdRa[1][0] = '*';
            pdRa[1][1] = '*';
            pieceDogR = pdRa;
            orientacion = 1;
            break;     
        }
    }
}
