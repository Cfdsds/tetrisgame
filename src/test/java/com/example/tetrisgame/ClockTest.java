package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class ClockTest {
    
    
    @Test
    // 1 segundo por tic
    void prueba_contador_test(){
        Board b1 = new Board();
        Clock c1 = new Clock(b1);

        c1.tic();

        assertEquals(1, c1.getTick());
        // Recorrer toda la primera fila y verificar que no hay ningún '*'
        for (int j = 0; j < b1.getBoard()[0].length; j++) {
            assert b1.getBoard()[0][j] == '.';
        }

    }
    



}
