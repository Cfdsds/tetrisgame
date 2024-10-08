package com.example.tetrisgame;

public class Tetris extends Clock {
    public Board board;
    int filasCompletadas;
    int canTic;
    public boolean partidaEnCurso;

    public Tetris() {
        board = new Board();
        this.filasCompletadas = 0;
        this.canTic = 0;
    }

    public void iniciarJuego(){
        this.partidaEnCurso = true;
    }

    public void ganar() {
        setPartidaEnCurso(false);
    }

    public void perder() {
        setPartidaEnCurso(false);
    }

    public boolean getPartidaEnCurso() {
        return this.partidaEnCurso;
    }

    public void setPartidaEnCurso(boolean partidaEnCurso) {
        this.partidaEnCurso = partidaEnCurso;
    }
}
