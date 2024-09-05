package com.example.tetrisgame;
import org.junit.jupiter.api.Test;

public class PieceTTest {
    @Test
    public void crearPieceT() {
        PieceT p = new PieceT();
        assert p != null;
    }

    @Test
    public void rotarTIzqTest(){
        PieceT pT = new PieceT();
        pT.rotate_left();
        assert pT.getOrientacion() == 2;
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[1][0] == '*';
        assert pT.getPieceT()[1][1] == '*';
        assert pT.getPieceT()[2][1] == '*';
    }

    @Test
    public void rotarTIzq2VecesTest(){
        PieceT pT = new PieceT();
        pT.rotate_left();
        pT.rotate_left();
        assert pT.getOrientacion() == 3;
        assert pT.getPieceT()[0][0] == '*';
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[0][2] == '*';
        assert pT.getPieceT()[1][1] == '*';
    }

    @Test
    public void rotarTIzq3VecesTest(){
        PieceT pT = new PieceT();
        pT.rotate_left();
        pT.rotate_left();
        pT.rotate_left();
        assert pT.getOrientacion() == 4;
        assert pT.getPieceT()[0][0] == '*';
        assert pT.getPieceT()[1][0] == '*';
        assert pT.getPieceT()[2][0] == '*';
        assert pT.getPieceT()[1][1] == '*';
    }

    /* ROTAMOS LA PIEZA A LA DERECHA */

    @Test
    public void rotarTDerTest(){
        PieceT pT = new PieceT();
        pT.rotate_right();
        assert pT.getOrientacion() == 4;
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[1][1] == '*';
        assert pT.getPieceT()[1][2] == '*';
        assert pT.getPieceT()[2][1] == '*';
    }

    @Test
    public void rotarTDer2VecesTest(){
        PieceT pT = new PieceT();
        pT.rotate_right();
        pT.rotate_right();
        assert pT.getOrientacion() == 3;
        assert pT.getPieceT()[0][0] == '*';
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[0][2] == '*';
        assert pT.getPieceT()[1][1] == '*';
    }

    @Test
    public void rotarTDer3VecesTest(){
        PieceT pT = new PieceT();
        pT.rotate_right();
        pT.rotate_right();
        pT.rotate_right();
        assert pT.getOrientacion() == 2;
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[1][0] == '*';
        assert pT.getPieceT()[1][1] == '*';
        assert pT.getPieceT()[2][1] == '*';
    }

    @Test
    public void rotarTDer4VecesTest(){
        PieceT pT = new PieceT();
        pT.rotate_right();
        pT.rotate_right();
        pT.rotate_right();
        pT.rotate_right();
        assert pT.getOrientacion() == 1;
        assert pT.getPieceT()[0][1] == '*';
        assert pT.getPieceT()[1][0] == '*';
        assert pT.getPieceT()[1][1] == '*';
        assert pT.getPieceT()[1][2] == '*';
    }

}
