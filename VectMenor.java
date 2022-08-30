/*
Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector
 */
package vectores;

import java.util.Scanner;

public class VectMenor {
    
    public Scanner teclado;
    public int[] vectorValor;
    public int posicion;
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
    
    public void menorValor() {
        
        int menor;
     
        menor=vectorValor[0];
        
        
        for(int x=1;x<vectorValor.length;x++) {
            if (vectorValor[x]<menor) {
                menor=vectorValor[x];
                posicion=x;
                
            }
        }
        
        imprimir("El menor valor es: " + vectorValor[posicion] );
        
    }
    
    public void seRepite(){
        int aux=0;
        for(int x=0;x<vectorValor.length-x;x++) {
            
            if (vectorValor[posicion]==vectorValor[x++]) {
                    
                    imprimir("el valor se repite dentro del vector");
            }       
        }
    }
        
    
    
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        VectMenor miVector = new VectMenor();
        miVector.inicializar();
        miVector.menorValor();
        miVector.seRepite();
        
    }
}
