package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class BoardTest {
    
    @Test
    void comprobar_tablero_test(){
        Board b1 = new Board();
        assert b1.getBoard()[0][0] == '.';
    }
    
    //@Test
    //void agregar_pieza_cuadrado_test(){
    //    Board b1 = new Board();
    //    PieceSquare piezaRandom = new PieceSquare();
//
    //    b1.addPieces(piezaRandom);
//
    //    assert b1.getBoard()[0][0] == '*';
    //    assert b1.getBoard()[0][1] == '*';
    //    assert b1.getBoard()[1][0] == '*';
    //    assert b1.getBoard()[1][1] == '*';
//
//
//
    //}

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
    

}








