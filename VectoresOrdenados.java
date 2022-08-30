/*
Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.
 */
package vectores;

import java.util.Scanner;

public class VectoresOrdenados {
    
    public Scanner teclado;
    public int[] vector;
    public int f=0;
    public int h=0;
    
    public void inicializar(){
        
        teclado = new Scanner (System.in);
        vector = new int[10];
       
        for(int x=0;x<vector.length;x++){
            
            imprimir("Ingrese el valor N°"+ (x+1) +" para el vector: ");
            vector[x] = teclado.nextInt();
   
        }
    }
        
    public void verificar(){
    
       for(int x=0;x<vector.length-1;x++){
           
            if(vector[x] < vector[x+1]){
                
               f = f + 1;
               
            }else{
        
                h = h + 1; 
            
            }
        }
       
        if(f>8){
            
            imprimir("Vector de menor a mayor");
       
        }else{
              if (h>8){
            
                   imprimir("Vector de mayor a menor");
              }else{
            
                    imprimir("El vector se encuentra desordenado");
                }
            }  
   }
   
   public void imprimir(String print){
        
        System.out.println(print);
                
    }

    public static void main(String args[]){

        VectoresOrdenados miVector = new VectoresOrdenados();
        miVector.inicializar();
        miVector.verificar();
    
    }
    
    
}
