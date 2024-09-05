package com.example.tetrisgame;

//la idea es que todas las piezas respondan a esta clase para


//crearse moverse y rotar
public abstract class PieceBase { 
    public abstract char[][] getPieza(); // Método abstracto
    public int x;
    public int y;

 
    public void NewPiece() {
        
    }

    public void RotatePiece() {

    }

    public int getX() {
        return x;
    }

    public void setX(int valor) {
        x = valor;
    }

    public int getY() {
        return y;
    }

    public void setY(int valor) {
        y = valor;
    }


}
