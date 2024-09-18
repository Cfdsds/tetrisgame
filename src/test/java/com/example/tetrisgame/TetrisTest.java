package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    void primer_juego_test() {
        // Inicializamos el tablero y la pieza
        Board board = new Board();

        assertNotNull(board.getBoard(), "El tablero no debería ser nulo");
        assertEquals(10, board.getBoard().length, "El tablero debería tener 10 filas");
        assertEquals(20, board.getBoard()[0].length, "El tablero debería tener 20 columnas");

        // Probar la adición de una pieza aleatoria al tablero
        PieceBase pieza = board.piezaActual; // Usa la pieza generada por defecto en el Board
        assertNotNull(pieza, "La pieza generada no debería ser nula");
        boolean added = board.addPieces(pieza);
        assertTrue(added, "La pieza debería poder añadirse al tablero");

        // Comprobar qué tipo de pieza es
        if (pieza instanceof PieceSquare) {
            assertTrue(pieza instanceof PieceSquare, "Se generó una pieza cuadrada");
        } else if (pieza instanceof PieceStick) {
            assertTrue(pieza instanceof PieceStick, "Se generó una pieza en forma de palo");
        } else if (pieza instanceof PieceDogLeft) {
            assertTrue(pieza instanceof PieceDogLeft, "Se generó una pieza en forma de perro izquierdo");
        } else if (pieza instanceof PieceDogRight) {
            assertTrue(pieza instanceof PieceDogRight, "Se generó una pieza en forma de perro derecho");
        } else if (pieza instanceof PieceLLeft) {
            assertTrue(pieza instanceof PieceLLeft, "Se generó una pieza en forma de L invertida");
        } else if (pieza instanceof PieceLRight) {
            assertTrue(pieza instanceof PieceLRight, "Se generó una pieza en forma de L");
        } else if (pieza instanceof PieceT) {
            assertTrue(pieza instanceof PieceT, "Se generó una pieza en forma de T");
        } else {
            fail("Se generó una pieza desconocida");
        }


        // Mover la pieza completamente hacia la izquierda
        while (pieza.getY() > 0) {
            board.moverIzquierda(pieza);
        }
        // Verificar que la pieza está completamente a la izquierda
        assertEquals(0, pieza.getY(), "La pieza debería estar en la columna más a la izquierda");

        //assert board.getBoard()[0][0] == '*';
        //assert board.getBoard()[1][0] == '*';


        // Mover la pieza completamente hacia abajo hasta la última fila
        for(int i = 0; i < 10; i++){
            board.bajarPieza(pieza);
        }
        
        //assert board.getBoard()[8][0] == '*';

    }

    @Test
    void juego_Ganador(){

        Tetris t = new Tetris();
        PieceBase pS = new PieceSquare();

        t.iniciarJuego();

        for (int j = 0; j < 20; j += 2) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        //assertEquals(t.board.estaCompleta(0), true, "la fila 0 debería estar completa");
        //assertEquals(t.board.estaCompleta(1), true, "la fila 1 debería estar completa");

        assert t.board.estaCompleta(8) == true;
        assert t.board.estaCompleta(9) == true;

        t.board.borrarFila(9);
        t.filasCompletadas++;
        assert t.board.estaVacia(8) == true;


        t.board.borrarFila(9);
        t.filasCompletadas++;
        assert t.board.estaVacia(9) == true;

        assert t.filasCompletadas == 2;

        //segunda vuelta

        for (int j = 0; j < 20; j += 2) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(8) == true;
        assert t.board.estaCompleta(9) == true;

        t.board.borrarFila(9);
        t.filasCompletadas++;
        assert t.board.estaVacia(8) == true;


        t.board.borrarFila(9);
        t.filasCompletadas++;
        assert t.board.estaVacia(9) == true;

        assert t.filasCompletadas == 4;

        //tercera vuelta

        for (int j = 0; j < 20; j += 2) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(8) == true;
        assert t.board.estaCompleta(9) == true;

        t.board.borrarFila(9);
        t.filasCompletadas++;

        t.board.borrarFila(9);
        t.filasCompletadas++;
        assert t.canTic == 300;
        
        if (t.filasCompletadas == 5) {
            t.ganar();
            assert t.partidaEnCurso == false;
        }

    }



    @Test 
    void juego_perdedor_test() {
        Tetris t = new Tetris();
        PieceBase pS = new PieceSquare();

        t.iniciarJuego();

        for (int j = 0; j < 20; j += 3) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }


        assert t.board.estaCompleta(8) == false;
        assert t.board.estaCompleta(9) == false;

        //segunda vuelta

        for (int j = 0; j < 20; j += 3) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(6) == false;
        assert t.board.estaCompleta(7) == false;

        //tercera vuelta

        for (int j = 0; j < 20; j += 3) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(4) == false;
        assert t.board.estaCompleta(5) == false;
        
        //cuarta vuelta

        for (int j = 0; j < 20; j += 3) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(2) == false;
        assert t.board.estaCompleta(3) == false;

        //quinta vuelta

        for (int j = 0; j < 20; j += 3) {
            t.board.addPiecesEspecific(pS, 0, j);

            for (int i = 0; i < 10; i++) {
                t.board.bajarPieza(pS);
                t.canTic++;
            }
        }

        assert t.board.estaCompleta(0) == false;
        assert t.board.estaCompleta(1) == false;

        t.board.addPieces(pS);
        
        assertEquals(false, t.board.addPieces(pS));

        //if (t.filasCompletadas == 5) {
        //    t.ganar();
        //    assert t.partidaEnCurso == false;
        //}

        
    }

    @Test
    void rotar_dog_left() {
        Tetris t = new Tetris();
        PieceBase dL = new PieceDogLeft();
        t.iniciarJuego();

        t.board.addPieces(dL);
        dL.rotate_left();

        //assertEquals(dL.getOrientacion() == 2, "La rotación debe ser 2");
        assert dL.getOrientacion() == 2;
    }

}
