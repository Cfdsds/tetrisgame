package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceStickTest {
    @Test
    void crearPieceStick() {
        PieceStick pS = new PieceStick();
        assert pS != null;
    }

    @Test
    void rotarPaloIzqTest(){
        PieceStick pS = new PieceStick();
        pS.rotate_left();
        assert pS.getOrientacion() == 2;
        assert pS.getPieceStick()[0][0] == '*';
        assert pS.getPieceStick()[0][1] == '*';
        assert pS.getPieceStick()[0][2] == '*';
        assert pS.getPieceStick()[0][3] == '*';
    }

    @Test
    void rotarPaloDerTest(){
        PieceStick pS = new PieceStick();
        pS.rotate_right();
        assert pS.getOrientacion() == 2;
        assert pS.getPieceStick()[0][0] == '*';
        assert pS.getPieceStick()[0][1] == '*';
        assert pS.getPieceStick()[0][2] == '*';
        assert pS.getPieceStick()[0][3] == '*';
    }

    @Test
    void rotar2VecesElPaloIzqTest(){
        PieceStick pS = new PieceStick();
        pS.rotate_left();
        pS.rotate_left();
        assert pS.getOrientacion() == 1;
        assert pS.getPieceStick()[0][0] == '*';
        assert pS.getPieceStick()[1][0] == '*';
        assert pS.getPieceStick()[2][0] == '*';
        assert pS.getPieceStick()[3][0] == '*';
    }
}
