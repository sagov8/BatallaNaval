
package modelo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sagov8
 */
public class ControlBatallaNaval {
   int oceano [][]= new int [10][10];
   
   public void limpiar(){
       
       for (int fila = 0; fila < 10; fila++) {
           for (int columna = 0; columna < 10; columna++) {
             oceano[fila][columna]=0;  
           }
       }
       
  }
   
   public void asignarSubmarino(){
       Random aleatorio=new Random();
       for(int fila=0; fila<10; fila++){
           
             oceano[fila][aleatorio.nextInt(9)]=1 ;  
           
         
       }
   }
   
   public void fijarValor (int fila, int col, int valor){
              oceano[fila][col]=valor;
    
    }
   
   public void imprimir(){
       System.out.println("\n\t OCEANO ");
       for (int fila=0;fila<10; fila++){
           System.out.println("");
           for(int columna=0;columna<10;columna++){
               System.out.println("\t"+ oceano[fila][columna]);
           }
       }
   }
   
   public void comparar(){
      
          
      }
    
    
}


