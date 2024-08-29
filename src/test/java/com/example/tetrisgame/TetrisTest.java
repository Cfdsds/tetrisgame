package com.example.tetrisgame;
import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    public void crearTetris() {
        Tetris t = new Tetris();
        assert t != null;
    }
}
