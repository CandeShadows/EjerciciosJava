/*
Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos.
Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. 
Sumar componente a componente. 
 */

package vectores;

import java.util.Scanner;

public class VectoresSumados {
    
    public Scanner teclado;
    public int[] vector1;
    public int[] vector2;
    public int[] vectorSuma;
	
	public void inicializar(){
        
        teclado = new Scanner(System.in);
        vector1 = new int[4];
        vector2 = new int[4];
        
		
        for(int x=0;x<4;x++){
            
            imprimir("Ingrese valor N° "+ (x+1) +" para el VECTOR 1: ");
            vector1[x]=teclado.nextInt();
            
        }
                
        for(int x=0;x<4;x++){
            
            imprimir("Ingrese valor N° "+ (x+1) +" para el VECTOR 2: ");
            vector2[x] = teclado.nextInt();
        
        }      
    }    
    public void vectorSuma(){
       
        int suma=0;
        vectorSuma = new int[4];
        
        for(int x=0;x<4;x++){
            vectorSuma[x]= vector1[x] + vector2[x];
            suma = suma + vectorSuma[x];
        }
        
        imprimir("La suma de los 2 vectores es: "+suma);
    
    }
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }

    public static void main(String[] args) {
        
       VectoresSumados miVector = new VectoresSumados();
       miVector.inicializar();
       miVector.vectorSuma();
        
    }
    
    
}
