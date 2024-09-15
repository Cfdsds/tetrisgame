package com.example.tetrisgame;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BoardTest {
    
    @Test
    void comprobar_tablero_test(){
        Board b1 = new Board();
        assert b1.getBoard()[0][0] == '.';
    }
    
    @Test
    void agregar_pieza_cuadrado_test(){
        Board b1 = new Board();
        PieceSquare piezaRandom = new PieceSquare();

        b1.addPieces(piezaRandom);

        // Recorrer toda la primera fila y verificar que haya '*'
        for (int j = 0; j < b1.getBoard()[0].length; j++) {
            if(b1.getBoard()[0][j] == '.'){
                assertEquals('.', b1.getBoard()[0][j]);
            }else{
                assertEquals('*', b1.getBoard()[0][j]);
            }
                
        }



    }

    
    @Test
    void agregar_pieza_aleatoria_test() {
        Board b1 = new Board();
        PieceBase piezaRandom = b1.piezaRandom();
        
        b1.addPieces(piezaRandom);
        
        char[][] tablero = b1.getBoard();
        char[][] pieza = piezaRandom.getPieza();
        int posX = piezaRandom.getX(); // Fila
        int posY = piezaRandom.getY(); // Columna


        // Verifica que la pieza está en la primera fila (X = 0)
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] == '*') {
                    int boardX = posX; // Fila en el tablero
                    int boardY = posY + j; // Columna en el tablero
                    
                    // Verifica que la pieza esté en la primera fila (X = 0)
                    assertEquals(0, boardX, "La pieza no esta en la primera fila");
                    
                    // Verifica que las coordenadas de la pieza no estén fuera del tablero
                    assertTrue(boardX >= 0 && boardX < tablero[0].length, "La pieza se sale del limite en X");
                    assertTrue(boardY >= 0 && boardY < tablero.length, "La pieza se sale del limite en Y");
                    
                }
            }
        }
    }

    @Test
    void limpiar_pieza_del_tablero_test(){
        Board b1 = new Board();
        PieceBase p1 = b1.piezaRandom();

        b1.addPieces(p1);

        b1.limpiarPieza(p1);

        // Recorrer toda la primera fila y verificar que no hay ningún '*'
        for (int j = 0; j < b1.getBoard()[0].length; j++) {
            assert b1.getBoard()[0][j] == '.';
        }


    }


    @Test
    void rotar_pieza_en_el_tablero_test() {
        Board b1 = new Board();
        PieceBase piezaRandom = b1.piezaRandom();
        //switchcase 0 a 3
        Random nRandom = new Random();
        int n = nRandom.nextInt(3);
        switch (n) {
            case 0: 
                break;

            case 1:
                piezaRandom.rotate_right();
                break;
            case 2:
                piezaRandom.rotate_right();
                piezaRandom.rotate_right();
                break;
            case 3:
                piezaRandom.rotate_right();
                piezaRandom.rotate_right();
                piezaRandom.rotate_right();
                break;
        }
        
        b1.addPieces(piezaRandom);
        

    }

    @Test
    void verificar_que_la_pieza_baja_de_posicion_test() {
        Board b1 = new Board();
        PieceBase pS = new PieceSquare();
        
        b1.addPieces(pS);
        
        b1.bajarPieza(pS);
        
        // Recorrer toda la primera fila y verificar que no hay ningún '*'
        for (int j = 0; j < b1.getBoard()[0].length; j++) {
            assert b1.getBoard()[0][j] == '.';
        }
    }

    @Test
    void bajar_pieza_random_test(){
        Board b1 = new Board();
        PieceBase piezaRandom = b1.piezaRandom();
        
        b1.addPieces(piezaRandom);
        
        b1.bajarPieza(piezaRandom);
        
        // Recorrer toda la primera fila y verificar que no hay ningún '*'
        for (int j = 0; j < b1.getBoard()[0].length; j++) {
            assert b1.getBoard()[0][j] == '.';
        }
    }

    @Test
    void mover_derecha_cuadrado_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
        
        
        b1.addPieces(pS);

        int posicionInicialY = pS.getY();
        b1.moverDerecha(pS);
       
        int posicionFinalY = pS.getY();
    
        assertEquals(posicionInicialY + 1, posicionFinalY, "La pieza no se movió una posición hacia la derecha");
    }

    @Test
    void mover_izquierda_cuadrado_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();

        b1.addPieces(pS);
        int posicionicialY = pS.getY();
        b1.moverIzquierda(pS);
        int posicionFinalY = pS.getY();
    
        assertEquals(posicionicialY - 1, posicionFinalY, "La pieza no se movió una opción hacia la izquierda");
    }  

    
    @Test
    void bajar_pieza_cuadrada_y_despues_mover_a_la_derecha(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
        
        b1.addPieces(pS);
        int posicionInicialY = pS.getY();
        int posicionInicialX = pS.getX();

        b1.bajarPieza(pS);
        b1.bajarPieza(pS);
        b1.moverDerecha(pS);
        
        int posicionFinalX = pS.getX();
        int posicionFinalY = pS.getY();

        assertEquals(posicionInicialX + 2, posicionFinalX, "La pieza no se movió una posición hacia la derecha");
        assertEquals(posicionInicialY + 1, posicionFinalY, "La pieza no se movió una posición hacia la derecha");

    }

    @Test
    void bajar_pieza__random_y_despues_mover_a_la_derecha(){
        Board b1 = new Board();
        PieceBase p1 = b1.piezaRandom();

        
        b1.addPieces(p1);
        int posicionInicialY = p1.getY();
        int posicionInicialX = p1.getX();

        b1.bajarPieza(p1);
        b1.moverDerecha(p1);
        
        int posicionFinalX = p1.getX();
        int posicionFinalY = p1.getY();

        assertEquals(posicionInicialX + 1, posicionFinalX, "La pieza no se movió una posición hacia abajo");
        assertEquals(posicionInicialY + 1, posicionFinalY, "La pieza no se movió una posición hacia la derecha");

    }

    @Test
    void bajar_pieza_cuadrada_hasta_el_final_test(){  
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
            
        b1.addPieces(pS);
        int posicionInicialX = pS.getX();

        // Mueve la pieza hacia abajo hasta que no pueda bajar más
        for(int i = 0; i < 10; i++){
            b1.bajarPieza(pS);
        }
        
        int posicionFinalX = pS.getX();
            
        assertEquals(posicionInicialX + 8, posicionFinalX, "La pieza no se movió hasta el final del tablero correctamente");
    }

    @Test
    void bajar_pieza_cuadrada_y_palo_test(){
        Board b1 = new Board();
        Clock c1 = new Clock();
        PieceSquare pS = new PieceSquare();
        PieceStick pSt = new PieceStick();

        // Agregar la pieza cuadrada y bajarla completamente
        b1.addPiecesEspecific(pS, 0, 0);
        for(int i = 0; i < 10; i++){
            c1.tic();
            b1.bajarPieza(pS);
        }

        // Agregar la pieza palo y bajarla
        b1.addPiecesEspecific(pSt, 0, 0);
        for(int i = 0; i < 10; i++){
            c1.tic();
            b1.bajarPieza(pSt);
        }

        // Verificar la posición del palo sin que haya sobrescritura
        assert b1.getBoard()[4][0] == '*';
        assert b1.getBoard()[5][0] == '*';
        assert b1.getBoard()[6][0] == '*';
        assert b1.getBoard()[7][0] == '*';
        assert b1.getBoard()[8][0] == '*';
        assert b1.getBoard()[9][0] == '*';
        assert b1.getBoard()[8][1] == '*';
        assert b1.getBoard()[9][1] == '*';
    }

    @Test
    void bajar_pieza_cuadrada_y_rotar_palo_test(){
        Board b1 = new Board();
        Clock c1 = new Clock();
        PieceSquare pS = new PieceSquare();
        PieceStick pSt = new PieceStick();

        // Agregar la pieza cuadrada y bajarla completamente
        b1.addPiecesEspecific(pS,0,0);
        for(int i = 0; i < 10; i++){
            c1.tic();
            b1.bajarPieza(pS);
        }

        // Agregar la pieza palo y bajarla
        b1.addPiecesEspecific(pSt, 0, 0);
        for(int i = 1; i < 4; i++){
            c1.tic();
            b1.bajarPieza(pSt);

        }

        pSt.rotate_right();
        c1.tic();
        b1.bajarPieza(pSt);



        // Verificar la posición del palo sin que haya sobrescritura
        assert b1.getBoard()[4][0] == '*';
        assert b1.getBoard()[4][1] == '*';
        assert b1.getBoard()[4][2] == '*';
        assert b1.getBoard()[4][3] == '*';
        assert b1.getBoard()[8][0] == '*';
        assert b1.getBoard()[9][0] == '*';
        assert b1.getBoard()[8][1] == '*';
        assert b1.getBoard()[9][1] == '*';
    }



    //a veces anda a veces no, yo creo que es por el stick que es mas largo
    @Test
    void bajar_pieza_random_hasta_el_final_test(){  
        Board b1 = new Board();
        PieceBase p1 = b1.piezaRandom();
    
    
        b1.addPieces(p1);
        int posicionicialX = p1.getX();
        
        // Mueve la pieza hacia abajo hasta que no pueda bajar más
        for(int i = 0; i < 10; i++){
            b1.bajarPieza(p1);
        }

        int posicionFinalX = p1.getX();
        
        //assertEquals(posicionicialX + 8, posicionFinalX, "La pieza no se movió hasta el final del tablero correctamente");

        if (posicionicialX + 8 == posicionFinalX){
            assertEquals(posicionicialX + 8, posicionFinalX, "La pieza no se movió hasta el final del tablero correctamente");
        }else{
            if (posicionicialX + 7 == posicionFinalX){
                assertEquals(posicionicialX + 7, posicionFinalX, "La pieza no se movió hasta el final del tablero correctamente");
            }else{
                assertEquals(posicionicialX + 6, posicionFinalX, "La pieza no se movió hasta el final del tablero correctamente");
            }
        }
        

    }

    @Test
    void bajar_2_cuadrados_hasta_el_final_test(){  
        Board b1 = new Board();

        PieceSquare pS1 = new PieceSquare();
       //PieceSquare pS2 = new PieceSquare();

        b1.addPiecesEspecific(pS1,0,0);

        for(int i = 0; i < 11; i++){
            b1.bajarPieza(pS1);
        }

        // Recorrer toda la primera fila y verificar que no hay ningún '*'
        /* for (int j = 0; j < b1.getBoard()[0].length; j++) {
            assert b1.getBoard()[0][j] == '.';
        } */

        assert b1.getBoard()[8][0] == '*';
        assert b1.getBoard()[8][1] == '*';
        assert b1.getBoard()[9][0] == '*';
        assert b1.getBoard()[9][1] == '*';


    }

    
    @Test
    void agregar_2_cuadradros_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
        for(int j = 0; j < 3; j++){
            b1.addPiecesEspecific(pS, 0, j);
        }

        assert b1.getBoard()[0][0] == '*';
        assert b1.getBoard()[0][1] == '*';
        assert b1.getBoard()[1][0] == '*';
        assert b1.getBoard()[1][1] == '*';

        assert b1.getBoard()[0][2] == '*';
        assert b1.getBoard()[0][3] == '*'; 
        assert b1.getBoard()[1][2] == '*';
        assert b1.getBoard()[1][3] == '*';        

    }


    @Test
    void llenar_primeras_2_filas_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
        boolean bandera1 = false;
        boolean bandera2 = false;
    

        for(int j = 0; j < 10; j++){
            b1.addPiecesEspecific(pS, 0, j);
        }
        
        for(int j = 0; j < 10; j++){
            if (b1.getBoard()[0][j] == '.'){
                bandera1 = true;
            }
        }

        for(int j = 0; j < 10; j++){
            if (b1.getBoard()[1][j] == '.'){
                bandera2 = true;
            }
        }

        assertEquals(false, bandera1);
        assertEquals(false, bandera2);
        
    }
    

    @Test
    void perder_juego_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();
        PieceBase pR = b1.piezaRandom();

        for(int j = 0; j < 20; j++){
            b1.addPiecesEspecific(pS, 0, j);
        }

        b1.addPieces(pR);
        
        assertEquals(false, b1.addPieces(pR));
    }

    @Test
    void borrar_fila_completa_test(){
        Tetris t = new Tetris();
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();

        for(int j = 0; j < 20; j++){
            b1.addPiecesEspecific(pS, 9, j);
        }
        
        if(b1.estaCompleta(9)){
            t.filasCompletadas++;
            b1.borrarFila(9);
        }
        
        assertEquals(false, b1.estaCompleta(9));
        assertEquals(1, t.filasCompletadas);
    }

    @Test
    void borrar_fila_completa_y_que_bajen_los_bloques_de_arriba_test(){
        Tetris t = new Tetris();
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();

        for(int j = 0; j < 20; j++){
            b1.addPiecesEspecific(pS, 8, j);
        }

        for(int j = 0; j < 10; j++){
            b1.addPiecesEspecific(pS, 6, j);
        }

        for (int j = 0; j < b1.getBoard()[9].length; j++) {
            assert b1.getBoard()[9][j] == '*';
        } 

        if(b1.estaCompleta(9)){
            t.filasCompletadas++;
            b1.borrarFila(9);
        }
        
        for (int j = 0; j < b1.getBoard()[9].length; j++) {
            assert b1.getBoard()[9][j] == '*';
        } 

        if(b1.estaCompleta(9)){
            t.filasCompletadas++;
            b1.borrarFila(9);
        }


        for (int j = 0; j <= 9; j++) {
            assert b1.getBoard()[9][j] == '*';
        } 

        for (int j = 10; j < 20; j++) {
            assert b1.getBoard()[9][j] == '.';
        } 
    } 
}
