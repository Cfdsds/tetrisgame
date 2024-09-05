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

    @Test
    public void rotarLRightIzq2VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_left();
        plr.rotate_left();
        assert plr.getOrientacion() == 3;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[0][1] == '*';
        assert plr.getPieceLRight()[1][1] == '*';
        assert plr.getPieceLRight()[2][1] == '*';
    }


    @Test
    public void rotarLRightIzq3VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_left();
        plr.rotate_left();
        plr.rotate_left();
        assert plr.getOrientacion() == 4;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[0][1] == '*';
        assert plr.getPieceLRight()[0][2] == '*';
        assert plr.getPieceLRight()[1][0] == '*';
    }

    @Test
    public void rotarLRightIzq4VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_left();
        plr.rotate_left();
        plr.rotate_left();
        plr.rotate_left();
        assert plr.getOrientacion() == 1;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[1][0] == '*';
        assert plr.getPieceLRight()[2][0] == '*';
        assert plr.getPieceLRight()[2][1] == '*';
    }



    @Test
    public void rotarLRightDerTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_right();
        assert plr.getOrientacion() == 4;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[0][1] == '*';
        assert plr.getPieceLRight()[0][2] == '*';
        assert plr.getPieceLRight()[1][0] == '*';
    }

    @Test
    public void rotarLRightDer2VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_right();
        plr.rotate_right();
        assert plr.getOrientacion() == 3;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[0][1] == '*';
        assert plr.getPieceLRight()[1][1] == '*';
        assert plr.getPieceLRight()[2][1] == '*';
    }


    @Test
    public void rotarLRightDer3VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_right();
        plr.rotate_right();
        plr.rotate_right();
        assert plr.getOrientacion() == 2;
        assert plr.getPieceLRight()[1][0] == '*';
        assert plr.getPieceLRight()[1][1] == '*';
        assert plr.getPieceLRight()[1][2] == '*';
        assert plr.getPieceLRight()[0][2] == '*';
    }
    
    @Test
    public void rotarLRightDer4VecesTest(){
        PieceLRight plr = new PieceLRight();
        plr.rotate_right();
        plr.rotate_right();
        plr.rotate_right();
        plr.rotate_right();
        assert plr.getOrientacion() == 1;
        assert plr.getPieceLRight()[0][0] == '*';
        assert plr.getPieceLRight()[0][1] == '*';
        assert plr.getPieceLRight()[1][1] == '*';
        assert plr.getPieceLRight()[2][1] == '*';
    }
}
