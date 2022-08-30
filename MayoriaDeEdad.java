/*
Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas. 
Luego de realizar la carga por teclado de todos los datos,
imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años)
 */
package vectores;

import java.util.Scanner;

public class MayoriaDeEdad {
    
    public Scanner teclado;
    public String[] vectorNombres;
    public int[] vectorEdades;
    
    public void inicializar(){
    
        teclado = new Scanner(System.in);
        vectorNombres = new String[5];
        vectorEdades = new int[5];
        
	for(int x=0;x<5;x++){
            imprimir("Ingrese el nombre de la persona N°" + (x+1));
            vectorNombres[x] = teclado.next();
            
            imprimir("Ingrese la edad de la persona N°" + (x+1));
            vectorEdades[x] = teclado.nextInt();
        }
    }
    
    public void adultos(){
        
        imprimir("Las personas mayores a 18 son: ");
        
        for(int x=0;x<5;x++){
            
            if (vectorEdades[x]>17){
                imprimir(vectorNombres[x] + " y tiene " + (vectorEdades[x]));
            }
        }
    }
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        MayoriaDeEdad miVector = new MayoriaDeEdad();
        miVector.inicializar();
        miVector.adultos();
        
    }
    
}
