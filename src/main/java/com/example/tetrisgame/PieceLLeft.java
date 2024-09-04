package com.example.tetrisgame;

public class PieceLLeft extends PieceBase {
    private char[][] piecelleft;
    private int orientacion;
    public PieceLLeft(){

        piecelleft = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   piecelleft[i][j] = 0;
                }
            }

            piecelleft[2][0] = '*';
            piecelleft[2][1] = '*';
            piecelleft[1][1] = '*';
            piecelleft[0][1] = '*';
            
          
            orientacion = 1;
    }   

    public void rotate_left(){
        switch(orientacion){
        case 1://abajo
            //  ***
            //    *
            char[][] liabj = new char[3][3];
            liabj[0][0]= '*';
            liabj[0][1]= '*';
            liabj[0][2]= '*';
            liabj[1][2]= '*';
            piecelleft = liabj;
            orientacion = 2;
            break; 

        case 2: //derecha
        //  **
        //  *
        //  *
            char[][] lid = new char[3][3];
            lid[0][0]= '*';
            lid[1][0]= '*';
            lid[2][0]= '*';
            lid[0][1]= '*';
            piecelleft = lid;
            orientacion = 3;
            break;  

        case 3: //arriba
        //   *
        //   ***
            char[][] liarb = new char[4][4];
            liarb[0][0]= '*';
            liarb[1][0]= '*';
            liarb[1][1]= '*';
            liarb[1][2]= '*';
            piecelleft = liarb;
            orientacion = 4;
            break;  

        case 4: //izq
        //   *
        //   *
        //  **
            char[][] lii = new char[3][3];
            lii[0][1]= '*';
            lii[1][1]= '*';
            lii[2][1]= '*';
            lii[2][0]= '*';
            piecelleft = lii;
            orientacion = 2;
            break;
    
        }
    }

    public void rotate_right(){
        switch(orientacion){
        case 1: //derecha
        //   *
        //   ***
            char[][] lid = new char[4][4];
            lid[0][0]= '*';
            lid[1][0]= '*';
            lid[1][1]= '*';
            lid[1][2]= '*';
            piecelleft = lid;
            orientacion = 4;
            break;  

        case 2: //abajo
        //  **
        //  *
        //  *
            char[][] liabj = new char[3][3];
            liabj[0][0]= '*';
            liabj[1][0]= '*';
            liabj[2][0]= '*';
            liabj[0][1]= '*';
            piecelleft = liabj;
            orientacion = 3;
            break;  
            

        case 3://izquierda
            //  ***
            //    *
            char[][] lii = new char[3][3];
            lii[0][0]= '*';
            lii[0][1]= '*';
            lii[0][2]= '*';
            lii[1][2]= '*';
            piecelleft = lii;
            orientacion = 2;
            break; 
        

        case 4: //arriba
        //   *
        //   *
        //  **
            char[][] liarb = new char[3][3];
            liarb[0][1]= '*';
            liarb[1][1]= '*';
            liarb[2][1]= '*';
            liarb[2][0]= '*';
            piecelleft = liarb;
            orientacion = 2;
            break;
    
        }
    }


    public int getOrientacion(){
        return orientacion;
    }
        

    public char[][]getPieceLLeft(){
        return piecelleft;
    }

}
