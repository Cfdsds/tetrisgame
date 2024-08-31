package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceSquareTest {
    @Test
    public void crearPieceSquare() {
        PieceSquare pSqre = new PieceSquare();
        assert pSqre != null;
    }
}
