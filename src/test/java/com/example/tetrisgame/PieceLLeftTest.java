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

    @Test
    public void rotarLLeftIzq2VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_left();
        pll.rotate_left();
        assert pll.getOrientacion() == 3;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[1][0] == '*';
        assert pll.getPieceLLeft()[2][0] == '*';
        assert pll.getPieceLLeft()[0][1] == '*';
    }

    @Test
    public void rotarLLeftIzq3VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_left();
        pll.rotate_left();
        pll.rotate_left();
        assert pll.getOrientacion() == 4;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[1][0] == '*';
        assert pll.getPieceLLeft()[1][1] == '*';
        assert pll.getPieceLLeft()[1][2] == '*';
    }

    @Test 
    public void rotarLLeftIzq4VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_left();
        pll.rotate_left();  
        pll.rotate_left();
        pll.rotate_left();
        assert pll.getOrientacion() == 1;
        assert pll.getPieceLLeft()[0][1] == '*';
        assert pll.getPieceLLeft()[1][1] == '*';
        assert pll.getPieceLLeft()[2][1] == '*';
        assert pll.getPieceLLeft()[2][0] == '*';    
    }

    @Test
    public void rotarLLeftDerTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_right();
        assert pll.getOrientacion() == 2;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[1][0] == '*';
        assert pll.getPieceLLeft()[1][1] == '*';
        assert pll.getPieceLLeft()[1][2] == '*';
    }

    @Test
    public void rotarLLeftDer2VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_right();
        pll.rotate_right();
        assert pll.getOrientacion() == 3;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[1][0] == '*';
        assert pll.getPieceLLeft()[2][0] == '*';
        assert pll.getPieceLLeft()[0][1] == '*';
    }

    @Test
    public void rotarLLeftDer3VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_right();
        pll.rotate_right();
        pll.rotate_right();
        assert pll.getOrientacion() == 4;
        assert pll.getPieceLLeft()[0][0] == '*';
        assert pll.getPieceLLeft()[0][1] == '*';
        assert pll.getPieceLLeft()[0][2] == '*';
        assert pll.getPieceLLeft()[1][2] == '*';
    }

    @Test
    public void rotarLLeftDer4VecesTest(){
        PieceLLeft pll = new PieceLLeft();
        pll.rotate_right();
        pll.rotate_right();
        pll.rotate_right();
        pll.rotate_right();
        assert pll.getOrientacion() == 1;
        assert pll.getPieceLLeft()[0][1] == '*';
        assert pll.getPieceLLeft()[1][1] == '*';
        assert pll.getPieceLLeft()[2][1] == '*';
        assert pll.getPieceLLeft()[2][0] == '*';
    }
}
