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

    @Test
    public void rotarDogLeftIzq2VecesTest(){
        PieceDogLeft pdl = new PieceDogLeft();
        pdl.rotate_left();
        pdl.rotate_left();
        assert pdl.getOrientacion() == 1;
        assert pdl.getPieceDogLeft()[0][0] == '*';
        assert pdl.getPieceDogLeft()[0][1] == '*';
        assert pdl.getPieceDogLeft()[1][1] == '*';
        assert pdl.getPieceDogLeft()[1][2] == '*';
    }

    @Test
    public void rotarDogLeftDerTest(){
        PieceDogLeft pdl = new PieceDogLeft();
        pdl.rotate_right();
        assert pdl.getOrientacion() == 2;
        assert pdl.getPieceDogLeft()[0][1] == '*';
        assert pdl.getPieceDogLeft()[1][1] == '*';
        assert pdl.getPieceDogLeft()[1][0] == '*';
        assert pdl.getPieceDogLeft()[2][0] == '*';
    }

    @Test
    public void rotarDogLeftDer2VecesTest(){
        PieceDogLeft pdl = new PieceDogLeft();
        pdl.rotate_right();
        pdl.rotate_right();
        assert pdl.getOrientacion() == 1;
        assert pdl.getPieceDogLeft()[0][0] == '*';
        assert pdl.getPieceDogLeft()[0][1] == '*';
        assert pdl.getPieceDogLeft()[1][1] == '*';
        assert pdl.getPieceDogLeft()[1][2] == '*';
    }

    @Test
    void rotar_dog_left() {
        Board board = new Board();
        PieceBase dL = new PieceDogLeft();

        board.addPieces(dL);
        dL.rotate_left();

        assert dL.getOrientacion() == 2;
    }
}
