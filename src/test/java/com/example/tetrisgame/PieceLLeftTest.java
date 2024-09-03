package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceLLeftTest {
    @Test
    public void crearPieceLLeft() {
        PieceLLeft pll = new PieceLLeft();
        assert pll != null;
    }

    @Test
    public void rotarLLeftIzqTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_left();
        assert pll.getOrientacion() == 2;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[0][1] == '*';
        assert pll.getPieceLLeft()[0][2] == '*';
        assert pll.getPieceLLeft()[1][2] == '*';
    }
}
