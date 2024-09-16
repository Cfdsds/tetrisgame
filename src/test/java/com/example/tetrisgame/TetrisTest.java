package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        
        assert board.getBoard()[8][0] == '*';

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
        
        if (t.filasCompletadas == 4) {
            t.ganar();
        }

    }



    @Test 
    void juego_perdedor_test() {
        Tetris t = new Tetris();
        t.iniciarJuego();

        // Llenar el tablero con piezas cuadradas
        for (int i = 0; i < t.board.getBoard().length; i++) {
            for (int j = 0; j < t.board.getBoard()[0].length; j++) {
                PieceBase pieza = new PieceSquare(); // O cualquier pieza que quieras usar
                pieza.setX(i); // Ajusta las coordenadas si es necesario
                pieza.setY(j); // Ajusta las coordenadas si es necesario
                t.board.addPiecesEspecific(pieza, i, j); // Añadir piezas hasta llenar el tablero 
            }
        }

        // Verificar que la fila 0 esté completa
        assert t.board.estaCompleta(0) == true;

        // Ahora intenta agregar una nueva pieza
        PieceBase nuevaPieza = t.board.piezaRandom(); // O cualquier método que devuelva una nueva pieza
        boolean canAdd = t.board.addPieces(nuevaPieza); // Intenta agregarla

        // Verifica que no se pueda agregar
        assertFalse(canAdd, "Debería ser imposible agregar una nueva pieza cuando el tablero está lleno");
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
