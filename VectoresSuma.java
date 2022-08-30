/*
Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50
 */
package vectores;

import java.util.Scanner;

public class VectoresSuma {
    private Scanner teclado;
    private float vector[];
  
    public void inicializar(){
    
        teclado = new Scanner(System.in);
        vector = new float[8];
        
	for(int x=0;x<8;x++){
            imprimir("Ingrese el valor N°" + (x+1) + " del vector: ");
            vector[x] = teclado.nextFloat();
        }
    }
    
    public void verificar(){
       
        float totVector=0;
        float totMayor36=0;
        float totMayor50=0;
		
        for(int x=0;x<8;x++){
            totVector = totVector + vector[x];
            
            if(vector[x]>36)
                totMayor36=totMayor36 + vector[x];
            
            if(vector[x]>50)
                totMayor50++;
        }
        
        imprimir("El acumulado del vector es: " + totVector);
        imprimir("El acumulado del vector con valores mayores a 36: " + totMayor36);
        imprimir("La cantidad de valores ingresados 50 es: " + totMayor50);
    
    }
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }

    public static void main(String[] args) {
        
        VectoresSuma miVector = new VectoresSuma();
        miVector.inicializar();
        miVector.verificar();
        
    }
}
