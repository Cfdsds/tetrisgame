package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceLRightTest {
    @Test
    public void crearPieceL() {
        PieceLRight plr = new PieceLRight();
        assert plr != null;
    }

    @Test
    public void rotarLRightIzqTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_left();
        assert plr.getOrientacion() == 2;
        assert plr.getPieceLRight()[1][0] == '*';
        assert plr.getPieceLRight()[1][1] == '*';
        assert plr.getPieceLRight()[1][2] == '*';
        assert plr.getPieceLRight()[0][2] == '*';
    }

    
}
