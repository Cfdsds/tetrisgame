package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TetrisTest {
    @Test
    void crearTetris() {
        Tetris t = new Tetris();
        assert t != null;

    }

    @Test
    void iniciarJuego() {
        Tetris t = new Tetris();
        t.iniciarJuego();
        t.canTic++;
        assert t.partidaEnCurso == true;
    }

    @Test
    void agregarYBajarCuadrado(){
        Tetris t = new Tetris();
        PieceBase pS = new PieceSquare();

        t.iniciarJuego();
        t.board.addPieces(pS);

        assertEquals(t.board.estaVacia(0), false);

        t.canTic++;
        t.board.bajarPieza(pS);

        assertEquals(t.board.estaVacia(0), true);
    }
}
