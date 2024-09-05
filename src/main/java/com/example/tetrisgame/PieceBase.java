package com.example.tetrisgame;

//la idea es que todas las piezas respondan a esta clase para


//crearse moverse y rotar
public class PieceBase { 
    public char[][] pieza;
    public char[][] matrizVacia;
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

    public char[][] getPieza(){
        return pieza;
    }

    public void setPieza(char[][] valor) {
        pieza = valor;
    }
}
