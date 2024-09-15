package com.example.tetrisgame;

import java.util.Random;

public class Board {
    //tablero de 10x20
    public char[][] tablero;
    public PieceBase piezaActual;


    public Board() {
        piezaActual = piezaRandom();
        tablero = new char[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                tablero[i][j] = '.';
            }
        }

    }

    public char[][] getBoard() {
        return tablero;
    }




    public PieceBase piezaRandom() {
        Random random = new Random();
        int tipoPieza = random.nextInt(7); // Cambia el rango según el número de piezas
        switch(tipoPieza) {
            case 0:
                return new PieceStick();
            case 1:
                return new PieceSquare();
            case 2:
                return new PieceDogLeft();
            case 3:
                return new PieceDogRight();
            case 4:
                return new PieceLLeft();
            case 5:
                return new PieceLRight();
            case 6:
                return new PieceT();       
        }
        return null;
    } 
    
    


    public boolean addPieces(PieceBase piezaR) {
        Random random = new Random();
        
        // Calcula el máximo valor para Y (columnas)
        int maxY = tablero[0].length - piezaR.getPieza()[0].length;
        int randomY = random.nextInt(maxY + 1); // Genera una posición Y aleatoria
        int fixedX = 0; // X siempre será 0 para que la pieza aparezca en la primera fila
        
        piezaR.setX(fixedX); // Establece X en 0 (fila)
        piezaR.setY(randomY); // Establece Y en posición aleatoria (columna)
        
        char[][] pieza = piezaR.getPieza(); // Obtiene la matriz de la pieza
        int posX = piezaR.getX(); // Fila
        int posY = piezaR.getY(); // Columna
        
    
        // Verifica si alguna posición donde se va a colocar la pieza está ocupada
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i; // Fila en el tablero
                    int boardY = posY + j; // Columna en el tablero

                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        // Si ya hay algo en la celda del tablero, cancela la operación
                        if (tablero[boardX][boardY] != '.') {
                            
                            return false; // La operación falla si una posición está ocupada
                        }
                    }
                }
            }
        }

        // Si no se encontraron colisiones, coloca la pieza
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i;
                    int boardY = posY + j;

                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        tablero[boardX][boardY] = '*'; // Coloca la pieza
                    }
                }
            }
        }

        return true; // La operación fue exitosa
    }

    public boolean addPiecesEspecific(PieceBase piezaE, int posX, int posY) {
        char[][] pieza = piezaE.getPieza();

        // Verifica si alguna posición donde se va a colocar la pieza está ocupada
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i; // Fila en el tablero
                    int boardY = posY + j; // Columna en el tablero

                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        // Si ya hay algo en la celda del tablero, cancela la operación
                        if (tablero[boardX][boardY] != '.') {
                            Tetris.perder();
                            return false; // La operación falla si una posición está ocupada
                        }
                    }
                }
            }
        }

        // Si no se encontraron colisiones, coloca la pieza
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i;
                    int boardY = posY + j;

                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        tablero[boardX][boardY] = '*'; // Coloca la pieza
                    }
                }
            }
        }

        return true; // La operación fue exitosa
    }


    public void bajarPieza(PieceBase piezaR) {
        // Limpiar la posición actual de la pieza en el tablero
        limpiarPieza(piezaR);
    
        // Si puede bajar, mueve la pieza hacia abajo
        if (puedeBajar(piezaR)) {
            piezaR.setX(piezaR.getX() + 1);
            colocarPieza(piezaR);
            
        }else{
            // Volver a colocar la pieza en el mismo lugar
            colocarPieza(piezaR);
            addPieces(piezaRandom());
        }
        
        if(puedeRotar(piezaR)){
            piezaR.rotate_left();
        }
    
    }
    
    
    
    

    public void limpiarPieza(PieceBase piezaR) {
        char[][] pieza = piezaR.getPieza();
        int posX = piezaR.getX();
        int posY = piezaR.getY();
    
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i;
                    int boardY = posY + j;
                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        tablero[boardX][boardY] = '.';  // Limpiar la posición
                    }
                }
            }
        }
    }
    
    public void colocarPieza(PieceBase piezaR) {
        char[][] pieza = piezaR.getPieza();
        int posX = piezaR.getX();
        int posY = piezaR.getY();
    
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int boardX = posX + i;
                    int boardY = posY + j;
                    if (boardX >= 0 && boardX < tablero.length && boardY >= 0 && boardY < tablero[0].length) {
                        tablero[boardX][boardY] = pieza[i][j];  // Colocar la pieza en el tablero
                    }
                }
            }
        }
    }

    public void moverDerecha(PieceBase piezaR) {
        // Limpiar la posición actual de la pieza en el tablero
        limpiarPieza(piezaR);
    
        // Verificar si la pieza puede moverse hacia la derecha
        if (piezaR.getY() + piezaR.getPieza().length < 20) {
            // Si puede moverse, actualizar la posición X
            piezaR.setY(piezaR.getY() + 1);
        }
    
        // Volver a colocar la pieza en su nueva posición
        colocarPieza(piezaR);
    }
     
    public void moverIzquierda(PieceBase piezaR) {
        // Limpiar la posición actual de la pieza en el tablero
        limpiarPieza(piezaR);
    
            // Verificar si la pieza puede moverse hacia la izquierda (es decir, si Y > 0)
        if (piezaR.getY() > 0) {
            // Si puede moverse, actualizar la posición Y
            piezaR.setY(piezaR.getY() - 1);
        }
    
        // Volver a colocar la pieza en su nueva posición
        colocarPieza(piezaR);
    }

    public boolean puedeBajar(PieceBase piezaR) {
        char[][] pieza = piezaR.getPieza();
        int posX = piezaR.getX();
        int posY = piezaR.getY();
    
        // Verificar cada celda ocupada por la pieza
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int nuevaPosX = posX + i + 1; // La nueva posición en X al bajar
                    int nuevaPosY = posY + j;
    
                    // Verificar si está en el límite inferior o hay otra pieza debajo
                    if (nuevaPosX >= tablero.length || tablero[nuevaPosX][nuevaPosY] != '.') {
                        return false;
                    }
                }
            }
        }
        return true; // Si todas las celdas pueden bajar
    }

    public boolean puedeRotar(PieceBase piezaR) {
        boolean puedeRotar = true;
    
        char[][] pieza = piezaR.getPieza();
        int posX = piezaR.getX();
        int posY = piezaR.getY();
    
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++) {
                if (pieza[i][j] != '.') {
                    int nuevaPosX = posX + i;
                    int nuevaPosY = posY + j;
                    if (nuevaPosX >= tablero.length || nuevaPosX < 0 || nuevaPosY >= tablero[0].length || nuevaPosY < 0 || tablero[nuevaPosX][nuevaPosY] != '.') {
                        puedeRotar = false;
                    }
                }
            }
        }
    
        return puedeRotar;
    }

    
    public void llegarAlFinal(PieceBase piezaAct) {
        //agregar nueva pieza(esta mal)
       colocarPieza(piezaAct);
       addPieces(piezaRandom());
    }

    public boolean estaCompleta(int fila) {
        for (int j = 0; j < tablero[0].length; j++) {
            if(tablero[fila][j] == '.'){
                return false;
            }
        }
        return true;
    }
    

    public boolean borrarFila(int fila) {
        boolean filaCompleta = true;
    
        // Verificar si la fila está completa
        for (int j = 0; j < 20; j++) {
            if (tablero[fila][j] != '*') {
                filaCompleta = false;
                break;
            }
        }
    
        if (filaCompleta) {
            // Desplazar las filas superiores hacia abajo
            for (int i = fila - 1; i >= 0; i--) {
                for (int j = 0; j < 20; j++) {
                    tablero[i + 1][j] = tablero[i][j];
                }
            }
    
            // Limpiar la primera fila
            for (int j = 0; j < 20; j++) {
                tablero[0][j] = '.';
            }
    
            return true; // Fila eliminada correctamente
        } else {
            return false; // Fila no completa
        }
    }
}
    
