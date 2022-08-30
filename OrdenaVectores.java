/*
Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector
 */
package vectores;

import java.util.Scanner;

public class OrdenaVectores {
    
 public Scanner teclado;
    public int[] vectorValor;
    
    public void inicializar(){
    
        teclado = new Scanner(System.in);
   
        int tamanoVector = 0;
        
        imprimir("ingrese la cantidad de valores a ingresar");
        tamanoVector = teclado.nextInt();
        vectorValor = new int[tamanoVector];
	
        for(int x=0;x<tamanoVector;x++){
            
            imprimir("Ingrese el valor N°" + (x+1));
            vectorValor[x] = teclado.nextInt();
            
        }
    }
    
    public void ordenarValor() {
        for(int x=0;x<vectorValor.length-x;x++) {
            
            for(int f=0;f<vectorValor.length-1;f++) {
                
                if (vectorValor[f]>vectorValor[f+1]) {
                    
                    int aux;
                    
                    aux=vectorValor[f];
                    vectorValor[f]=vectorValor[f+1];
                    vectorValor[f+1]=aux;
                    
                }
            }
        }
    }
	
    public void printValores() {
        imprimir("El vector ordenado de menor a mayor.");
        for(int f=0;f<vectorValor.length;f++) {
            imprimir("" + vectorValor[f]);
        }
    }
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }    
    
    public static void main(String[] args) {
        
        OrdenaVectores miVector = new OrdenaVectores();
        miVector.inicializar();
        miVector.ordenarValor();
        miVector.printValores();
    
    }
}
