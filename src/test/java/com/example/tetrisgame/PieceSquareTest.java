package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceSquareTest {
    @Test
    public void crearPieceSquare() {
        PieceSquare pSqre = new PieceSquare();
        assert pSqre != null;
    }

    @Test
    public void rotarCuadradoIzqTest(){
        PieceSquare pSq = new PieceSquare();
        pSq.rotate_left();
        assert pSq.getOrientacion() == 2;
        assert pSq.getPieceSquare()[0][0] == '*';
        assert pSq.getPieceSquare()[0][1] == '*';
        assert pSq.getPieceSquare()[1][0] == '*';
        assert pSq.getPieceSquare()[1][1] == '*';
    }

    
}
