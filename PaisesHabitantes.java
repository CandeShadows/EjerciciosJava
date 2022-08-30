/*
Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo. 
Ordenar alfabéticamente e imprimir los resultados. 
Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
 */
package vectores;

import java.util.Scanner;
import java.util.Collections;


public class PaisesHabitantes {
    
    public Scanner teclado;
    public int[] vectorHabitantes;
    public String[] vectorPaises;
        
    public void inicializar(){
        
        teclado = new Scanner(System.in);
   
        int tamanoVector = 0;
        
        imprimir("ingrese la cantidad de valores a ingresar");
        tamanoVector = teclado.nextInt();
        
        vectorHabitantes = new int[tamanoVector];
	vectorPaises = new String[tamanoVector];
       
        for(int x=0;x<tamanoVector;x++){
            
            imprimir("Ingrese el nombre del Pais N° " + (x+1));
            vectorPaises[x] = teclado.next();
            
            imprimir("Ingrese la cantidad de habitantes de: " + vectorPaises[x]);
            vectorHabitantes[x] = teclado.nextInt();
        
        }
    }
    
     public void ordenarPorHab() {
         
        int auxHab;
        String auxPaises;
         
        for(int x=0;x<vectorHabitantes.length-x;x++) {
            
            for(int f=0;f<vectorHabitantes.length-1;f++) {
                
                if (vectorHabitantes[f]<vectorHabitantes[f+1]) {
                    
                    auxHab=vectorHabitantes[f];
                    
                    vectorHabitantes[f]=vectorHabitantes[f+1];
                    vectorHabitantes[f+1]=auxHab;
                
                    auxPaises = vectorPaises[f];
                    
                    vectorPaises[f]=vectorPaises[f+1];
                    vectorPaises[f+1]=auxPaises;
                     
                }
            }
        }
    }
    
    public void listadoOrdenadoHab(){
        
        imprimir("La lista de paises ordenados por habitantes de mayor a menor es; ");
        
        for(int x=0;x<vectorPaises.length;x++){
            
           imprimir("PAÍS: "+ vectorPaises[x] + "; HABITANTES: " + vectorHabitantes[x] + ".");
            
        }
    }
    
    public void listadoOrdenadoAlf(){
        
         for(int x=0;x<vectorPaises.length;x++){
            
          
            
        }
        
        
    }
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        PaisesHabitantes miVector = new PaisesHabitantes();
        miVector.inicializar();
        miVector.ordenarPorHab();
        miVector.listadoOrdenadoHab();
        miVector.listadoOrdenadoAlf();
        
    }
}
