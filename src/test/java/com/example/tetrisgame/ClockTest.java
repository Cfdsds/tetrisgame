package com.example.tetrisgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class ClockTest {
    
    
    @Test
    // 1 segundo por tic
    void prueba_contador_test(){
        Clock c1 = new Clock();

        c1.tic();

        assertEquals(1, c1.getTick());


    }
    



}
