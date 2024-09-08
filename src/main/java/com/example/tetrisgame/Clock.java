package com.example.tetrisgame;

public class Clock {
    private int tic = 0;


    public int getTick(){
        return tic;
    }

    public void setTick(int valor){
        valor = tic;
    }

    public void ticCounter(){
        tic++;
    }

}
