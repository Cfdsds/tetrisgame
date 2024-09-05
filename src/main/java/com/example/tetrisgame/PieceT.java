package com.example.tetrisgame;

public class PieceT extends PieceBase {
    private char[][] piecet;
    private int orientacion;
    public PieceT(){

        piecet = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecet[i][j] = 0;
                }
            }

            piecet[0][1] = '*';
            piecet[1][0] = '*';
            piecet[1][1] = '*';
            piecet[1][2] = '*';
            
            
          
            orientacion = 1;
    
    }
    
    public void rotate_left(){
        switch(orientacion){
        case 1://izquierda
            //  *
            // **
            //  *
            char[][] ti = new char[3][3];
            ti[0][1]= '*';
            ti[1][0]= '*';
            ti[1][1]= '*';
            ti[2][1]= '*';
            piecet = ti;
            orientacion = 2;
            break;

        case 2: //abajo
        //  ***
        //   *
            char[][] tabj = new char[3][3];
            tabj[0][0]= '*';
            tabj[0][1]= '*';
            tabj[0][2]= '*';
            tabj[1][1]= '*';
            piecet = tabj;
            orientacion = 3;
            break; 

        case 3: //derecha
        //   *
        //   **
        //   *
            char[][] td = new char[3][3];
            td[0][0]= '*';
            td[1][0]= '*';
            td[2][0]= '*';
            td[1][1]= '*';
            piecet = td;
            orientacion = 4;
            break;    

        case 4: //arriba
        //   *
        //  ***
            char[][] tarb = new char[4][4];
            tarb[1][0]= '*';
            tarb[1][1]= '*';
            tarb[1][2]= '*';
            tarb[0][1]= '*';
            piecet = tarb;
            orientacion = 1;
            break;
    
        }
    }

    public void rotate_right(){
        switch(orientacion){
        case 1://derecha
            //  *
            //  **
            //  *
            char[][] td = new char[3][3];
            td[0][1]= '*';
            td[1][1]= '*';
            td[1][2]= '*';
            td[2][1]= '*';
            piecet = td;
            orientacion = 4;
            break;

        case 2: //arriba
        //   *
        //  ***
            char[][] tarb = new char[4][4];
            tarb[0][1]= '*';
            tarb[1][0]= '*';
            tarb[1][1]= '*';
            tarb[1][2]= '*';
            piecet = tarb;
            orientacion = 1;
            break;

        case 3: //izquierda
        //   *
        //  **
        //   *
            char[][] ti = new char[3][3];
            ti[0][1]= '*';
            ti[1][0]= '*';
            ti[1][1]= '*';
            ti[2][1]= '*';
            piecet = ti;
            orientacion = 2;
            break;    

        case 4: //abajo
        //  ***
        //   *
            char[][] tabj = new char[3][3];
            tabj[0][0]= '*';
            tabj[0][1]= '*';
            tabj[0][2]= '*';
            tabj[1][1]= '*';
            piecet = tabj;
            orientacion = 3;
            break; 
    
        }
    }



    public int getOrientacion(){
        return orientacion;
    }
        

    public char[][]getPieceT(){
        return piecet;
    }

    @Override
    public char[][] getPieza() {
        return piecet;
    }
}