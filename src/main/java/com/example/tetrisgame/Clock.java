package com.example.tetrisgame;

public class Clock {
    private int ticCont = 0;


    public int getTick(){
        return ticCont;
    }

    public void tic(){
        ticCont++;
    }

}
