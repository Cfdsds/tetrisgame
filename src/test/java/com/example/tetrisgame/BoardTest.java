package com.example.tetrisgame;
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
        PieceBase piezaRandom = new PieceSquare();

        b1.addPieces(piezaRandom);

        assert b1.getBoard()[0][0] == '*';
        assert b1.getBoard()[0][1] == '*';
        assert b1.getBoard()[1][0] == '*';
        assert b1.getBoard()[1][1] == '*';



    }

    @Test
    void agregar_pieza_aleatoria_test(){
        Board b1 = new Board();
        PieceBase piezaRandom = b1.piezaRandom();

        b1.addPieces(piezaRandom);

        assert b1.getBoard()[0][0] == '*';
        assert b1.getBoard()[0][1] == '*';
        assert b1.getBoard()[1][0] == '*';
        assert b1.getBoard()[1][1] == '*';

    }

}
