/*
Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor
 */
package vectores;

import java.util.Scanner;

public class VectorMenorMayorSueldo {
    
    public Scanner teclado;
    public int[] vectorSueldo;
    
    public void inicializar(){
    
        teclado = new Scanner(System.in);
   
        int tamanoVector = 0;
        
        imprimir("ingrese la cantidad de sueldos a ingresar");
        tamanoVector = teclado.nextInt();
        vectorSueldo = new int[tamanoVector];
	
        for(int x=0;x<tamanoVector;x++){
            
            imprimir("Ingrese el valor N°" + (x+1));
            vectorSueldo[x] = teclado.nextInt();
            
        }
    }
    
    public void menorValor() {
        
        int menor;
        int posicion;
        menor=vectorSueldo[0];
        posicion=0;
        
        for(int x=1;x<vectorSueldo.length;x++) {
            if (vectorSueldo[x]<menor) {
                menor=vectorSueldo[x];
                posicion=x;
            }
        
        }
        
        imprimir("El menor sueldo es: " + vectorSueldo[posicion] + " y está en la posición " + (posicion+1) );
    }
    public void mayorValor() {
        
        int mayor;
        int posicion1;
        mayor=vectorSueldo[0];
        posicion1=0;
        
        for(int x=1;x<vectorSueldo.length;x++) {
            if (vectorSueldo[x]>mayor) {
                mayor=vectorSueldo[x];
                posicion1=x;
            }
        
        }
        
        imprimir("El mayor sueldo es: " + vectorSueldo[posicion1] + " y está en la posición " + (posicion1+1) );
    }
    
    
       public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        VectorMenorMayorSueldo miVector = new VectorMenorMayorSueldo();
        miVector.inicializar();
        miVector.menorValor();
        miVector.mayorValor();
    }
    
}
