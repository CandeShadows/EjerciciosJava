/*
Confeccionar un programa que permita cargar los nombres de 5 operarios y 
sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.
 */
package vectores;

import java.util.Scanner;

public class VectorSueldos {
    
    public Scanner teclado;
    public String[] vectorOperario;
    public int[] vectorSueldo;
    
    public void inicializar(){
    
        teclado = new Scanner(System.in);
        vectorOperario = new String[5];
        vectorSueldo = new int[5];
        
	for(int x=0;x<5;x++){
            imprimir("Ingrese el nombre del operario N°" + (x+1));
            vectorOperario[x] = teclado.next();
            
            imprimir("Ingrese el sueldo de la persona N°" + (x+1));
            vectorSueldo[x] = teclado.nextInt();
       
        }
    }
    public void verificar(){
      
        int mayor = vectorSueldo[0];
        int pos = 0;
        
        for(int x=0;x<5;x++){
            
            if(vectorSueldo[x] > mayor){
                mayor = vectorSueldo[x];
                pos=x;
            }              
        }
        
        imprimir("El empleado con mayor sueldo es: " + vectorOperario[pos] + " y su sueldo es: " + vectorSueldo[pos]);
       
    }
    
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        VectorSueldos miVector = new VectorSueldos();
        miVector.inicializar();
        miVector.verificar();
        
    }
}
