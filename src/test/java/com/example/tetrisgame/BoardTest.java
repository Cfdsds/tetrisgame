package com.example.tetrisgame;
import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test
    void agregar_pieza_cuadrado_test(){
        Board b1 = new Board();
        PieceSquare pS = new PieceSquare();

        b1.addPieces(pS);

        assert b1.getBoard()[0][0] == '*';
        assert b1.getBoard()[0][1] == '*';
        assert b1.getBoard()[1][0] == '*';
        assert b1.getBoard()[1][1] == '*';


    }

    @Test
    void agregar_pieza_aleatorio_al_tablero_test(){
        Board b1 = new Board();
        b1.addPieces(random);
        




    }
}
