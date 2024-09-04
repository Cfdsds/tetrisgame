package com.example.tetrisgame;

public class PieceLRight extends PieceBase {
    private char[][] piecelright;
    private int orientacion;
    public PieceLRight(){

        piecelright = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecelright[i][j] = 0;
                }
            }

            piecelright[0][0] = '*';
            piecelright[1][0] = '*';
            piecelright[2][0] = '*';
            piecelright[2][1] = '*';
        
            orientacion = 1;
    }
    
    public void rotate_left(){
        switch(orientacion){
        case 1://arriba
            //     *
            //   ***
            char[][] ldarb = new char[3][3];
            ldarb[1][0]= '*';
            ldarb[1][1]= '*';
            ldarb[1][2]= '*';
            ldarb[0][2]= '*';
            piecelright = ldarb;
            orientacion = 2;
            break; 

        case 2: //izquierda
        // **
        //  *
        //  *
            char[][] ldi = new char[3][3];
            ldi[0][0]= '*';
            ldi[0][1]= '*';
            ldi[1][1]= '*';
            ldi[2][1]= '*';
            piecelright = ldi;
            orientacion = 3;
            break;  

        case 3: //abajo
        //   ***
        //   *
            char[][] ldabj = new char[4][4];
            ldabj[0][0]= '*';
            ldabj[0][1]= '*';
            ldabj[0][2]= '*';
            ldabj[1][0]= '*';
            piecelright = ldabj;
            orientacion = 4;
            break;  

        case 4: //derecha
        //   *
        //   *
        //   **
            char[][] ldd = new char[3][3];
            ldd[0][0]= '*';
            ldd[1][0]= '*';
            ldd[2][0]= '*';
            ldd[2][1]= '*';
            piecelright = ldd;
            orientacion = 1;
            break;
    
        }
    }

    public void rotate_right(){
        switch(orientacion){
        case 1://derecha
            //     *
            //   ***
            char[][] ld = new char[3][3];
            ld[1][0]= '*';
            ld[1][1]= '*';
            ld[1][2]= '*';
            ld[0][2]= '*';
            piecelright = ld;
            orientacion = 2;
            break; 

        case 2: //arriba
        // **
        //  *
        //  *
            char[][] larb = new char[3][3];
            larb[0][0]= '*';
            larb[0][1]= '*';
            larb[1][1]= '*';
            larb[2][1]= '*';
            piecelright = larb;
            orientacion = 3;
            break;  

        case 3: //izquierda
        //   ***
        //   *
            char[][] li = new char[4][4];
            li[0][0]= '*';
            li[0][1]= '*';
            li[0][2]= '*';
            li[1][0]= '*';
            piecelright = li;
            orientacion = 4;
            break;  

        case 4: //abajo
        //   *
        //   *
        //   **
            char[][] labj = new char[3][3];
            labj[0][0]= '*';
            labj[1][0]= '*';
            labj[2][0]= '*';
            labj[2][1]= '*';
            piecelright = labj;
            orientacion = 1;
            break;
    
        }
    }
    
    public int getOrientacion(){
        return orientacion;
    }
        
    public char[][]getPieceLRight(){
        return piecelright;
    }
}
