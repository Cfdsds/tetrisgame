package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    public void crearTetris() {
        Tetris t = new Tetris();
        assert t != null;

    }

    @Test
    public void iniciarJuego() {
        Tetris t = new Tetris();
        t.iniciarJuego();
        t.canTic++;
        assert t.partidaEnCurso == true;
    }

    @Test
    public void agregarYBajarCuadrado(){
        Tetris t = new Tetris();
        PieceBase pS = new PieceSquare();
        t.iniciarJuego();
        t.board.addPieces(pS);
        assert t.board.estaCompleta(0) == false;
        t.canTic++;
        t.board.bajarPieza(t.board.piezaActual);
        assertEquals(t.board.estaCompleta(0), false);
    }
}
