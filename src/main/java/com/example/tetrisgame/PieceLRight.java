package com.example.tetrisgame;

public class PieceLRight extends PieceBase {
    private char[][] piecelright;
    public PieceLRight(){

        piecelright = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecelright[i][j] = '.';
                }
            }

            piecelright[0][0] = '*';
            piecelright[1][0] = '*';
            piecelright[2][0] = '*';
            piecelright[2][1] = '*';
        
            setOrientacion(1);
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
            setOrientacion(2);
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
            setOrientacion(3);
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
            setOrientacion(4);
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
            setOrientacion(1);
            break;
    
        }
    }

    public void rotate_right(){
        switch(orientacion){
        case 1: //derecha
        //   ***
        //   *
            char[][] lrd = new char[4][4];
            lrd[0][0]= '*';
            lrd[0][1]= '*';
            lrd[0][2]= '*';
            lrd[1][0]= '*';
            piecelright = lrd;
            setOrientacion(4);
            break;

        case 2: //arriba
            //  *
            //  *
            //  **
                char[][] larr = new char[3][3];
                larr[0][0]= '*';
                larr[0][1]= '*';
                larr[1][1]= '*';
                larr[2][1]= '*';
                piecelright = larr;
                setOrientacion(1);
                break;  
        
        case 3://izquierda
            //     *
            //   ***
            char[][] lri = new char[3][3];
            lri[1][0]= '*';
            lri[1][1]= '*';
            lri[1][2]= '*';
            lri[0][2]= '*';
            piecelright = lri;
            setOrientacion(2);
            break;  

        case 4: //abajo
        //  **
        //   *
        //   *
            char[][] labj = new char[3][3];
            labj[0][0]= '*';
            labj[0][1]= '*';
            labj[1][1]= '*';
            labj[2][1]= '*';
            piecelright = labj;
            setOrientacion(3);
            break;  
    
        }
    }
    
    public int getOrientacion(){
        return orientacion;
    }
        
    public char[][]getPieceLRight(){
        return piecelright;
    }

    @Override
    public char[][] getPieza() {
        return piecelright;
    }
}
