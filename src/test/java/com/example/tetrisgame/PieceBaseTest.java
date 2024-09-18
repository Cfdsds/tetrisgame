package com.example.tetrisgame;
import org.junit.jupiter.api.Test;

public class PieceBaseTest {
    @Test
    public void crearPieceBase() {
        PieceBase pB = new PieceDogLeft();

        assert(pB != null);
    }

    @Test
    public void crearPieceBase2() {
        PieceBase pB = new PieceDogRight();
        pB.rotate_left();
        assert pB.getOrientacion() == 2;
    }

    @Test
    void setear_orientacion_test() {
        PieceBase pB = new PieceDogLeft();

        pB.setOrientacion(2);
        assert pB.getOrientacion() == 2;
    }
}
