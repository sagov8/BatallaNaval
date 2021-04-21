package modelo;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;

/**
 *
 * @author sagov8
 */
public class ControlBatallaNaval {

    int oceano[][] = new int[10][10];

    public void limpiar() {

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                oceano[fila][columna] = 0;
            }
        }

    }

    public void asignarSubmarino() {
        Random aleatorio = new Random();
        for (int fila = 0; fila < 10; fila++) {

            oceano[fila][aleatorio.nextInt(10)] = 1;

        }
    }

    public void fijarValor(int fila, int col, int valor) {
        oceano[fila][col] = valor;

    }

    public void imprimir() {
        System.out.println("\n\t OCEANO ");
        for (int fila = 0; fila < 10; fila++) {
            System.out.println("");
            for (int columna = 0; columna < 10; columna++) {
                System.out.println("\t" + oceano[fila][columna]);
            }
        }
    }

    //validacion de si gano o perdio 
    public boolean comparar(int puntos, int misiles) {
        boolean gameOver = false;
        if (puntos == 0 && misiles > 0) {
            JOptionPane.showMessageDialog(null, "\n GANASTE");
        }

        if (puntos < 10 && misiles == 0) {
            JOptionPane.showMessageDialog(null, "\n PERDISTE");
            gameOver = true;
        }

        return gameOver;
    }

    // cambio de imagenes
    public boolean submarinosEncontrados(JButton boton, int filas, int columnas) {
        boolean encontrados = false;
        if (oceano[filas][columnas] == 1) {
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/explosivo.gif")));
            encontrados = true;
            oceano[filas][columnas] = 0;
        } else {
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1(1).gif")));
            encontrados = false;
        }

        return encontrados;
    }

}
