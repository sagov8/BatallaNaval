package modelo;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author sagov8
 */
public class ControlBatallaNaval {

    int oceano[][] = new int[10][10];

    public void limpiar() {

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                if (oceano[fila][columna] == 0);    
 
            }

        }

    }

    public void asignarSubmarino() {
        Random aleatorio = new Random();
        for (int fila = 0; fila < 10; fila++) {

            oceano[fila][aleatorio.nextInt(10)] = 1;

        }
    }

    public void imprimir() {
        System.out.println("\n\t OCEANO ");
        for (int fila = 0; fila < 10; fila++) {
            System.out.println("");
            for (int columna = 0; columna < 10; columna++) {
                System.out.print("\t" + oceano[fila][columna]);
            }
        }
    }

    //validacion de si gano o perdio 
    public void comparar(int puntos, int misiles) {
        boolean gameOver = false;
        if (puntos == 10 && misiles > 0) {
            JOptionPane.showMessageDialog(null, "\n GANASTE");
        }

        if (puntos < 10 && misiles == 0) {
            JOptionPane.showMessageDialog(null, "\n PERDISTE");
            gameOver = true;
        }

        //return gameOver;
    }

    // cambio de imagenes
    public boolean submarinosEncontrados(JButton boton, int filas, int columnas, int puntos, JTextField puntaje) {
        boolean encontrados;
        puntos = Integer.parseInt(puntaje.getText());

        if (oceano[filas][columnas] == 1) {
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/explosivo.gif")));
            encontrados = true;
            oceano[filas][columnas] = 0;
            puntos++;
            puntaje.setText(String.valueOf(puntos));
        } else {

            encontrados = false;
        }

        return encontrados;
    }

    //Actualizar número de misiles y de diparos
    public void jugada(int misiles, int disparos, JTextField txt_misil, JTextField txt_disparo) {
        misiles = Integer.parseInt(txt_misil.getText());
        disparos = Integer.parseInt(txt_disparo.getText());

        if (misiles != 0) {

            misiles--;
            disparos++;
            txt_misil.setText(String.valueOf(misiles));
            txt_disparo.setText(String.valueOf(disparos));
        }
    }

}
