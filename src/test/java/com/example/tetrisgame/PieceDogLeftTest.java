package com.example.tetrisgame;

import org.junit.jupiter.api.Test;

public class PieceDogLeftTest {
    @Test
    public void crearPieceDog() {
        PieceDogLeft pdr = new PieceDogLeft();
        assert pdr != null;
    }

    @Test
    public void rotarDogLeftIzqTest(){
        PieceDogLeft pdl = new PieceDogLeft();
        pdl.rotate_left();
        assert pdl.getOrientacion() == 2;
        assert pdl.getPieceDogLeft()[0][1] == '*';
        assert pdl.getPieceDogLeft()[1][1] == '*';
        assert pdl.getPieceDogLeft()[1][0] == '*';
        assert pdl.getPieceDogLeft()[2][0] == '*';
    }
}
