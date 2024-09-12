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


        
}
