package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceDogRightTest {
    @Test
    public void crearPieceDog() {
        PieceDogRight pdr = new PieceDogRight();
        assert pdr != null;
    }

    @Test
    public void rotarDogRightIzqTest(){
        PieceDogRight pdr = new PieceDogRight();
        pdr.rotate_left();
        assert pdr.getOrientacion() == 2;
        assert pdr.getPieceDogRight()[0][0] == '*';
        assert pdr.getPieceDogRight()[1][0] == '*';
        assert pdr.getPieceDogRight()[1][1] == '*';
        assert pdr.getPieceDogRight()[2][1] == '*';
    }
}
