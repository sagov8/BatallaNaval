
package control;

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
   
   public void imprimir(){
       System.out.println("\n\t OCEANO SV");
       for (int fila=0;fila<10; fila++){
           System.out.println("");
           for(int columna=0;columna<10;columna++){
               System.out.println("\t"+ oceano[fila][columna]);
           }
       }
   }
}
