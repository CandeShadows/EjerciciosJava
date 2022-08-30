/*
Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas.
Luego ordenar las notas de mayor a menor. 
Imprimir las notas y los nombres de los alumnos.
 */
package vectores;

import java.util.Scanner;

public class NotasAlunmosOrdenadas {
    
    public Scanner teclado;
    public int[] vectorNotas;
    public String[] vectorAlumnos;
       
    public void inicializar(){
        
        teclado = new Scanner(System.in);
   
        int tamanoVector = 0;
        
        imprimir("ingrese la cantidad de valores a ingresar");
        tamanoVector = teclado.nextInt();
        vectorNotas = new int[tamanoVector];
	vectorAlumnos = new String[tamanoVector];
        for(int x=0;x<tamanoVector;x++){
            
            imprimir("Ingrese el nombre del alumno N° " + (x+1));
            vectorAlumnos[x] = teclado.next();
            
            imprimir("Ingrese la nota del alumno " + vectorAlumnos[x]);
            vectorNotas[x] = teclado.nextInt();
        }
    }
     public void ordenarNotas() {
         
        int auxNotas;
        String auxAlum;
         
        for(int x=0;x<vectorNotas.length-x;x++) {
            
            for(int f=0;f<vectorNotas.length-1;f++) {
                
                if (vectorNotas[f]<vectorNotas[f+1]) {
                    
                    auxNotas=vectorNotas[f];
                    
                    vectorNotas[f]=vectorNotas[f+1];
                    vectorNotas[f+1]=auxNotas;
                
                    auxAlum = vectorAlumnos[f];
                    
                    vectorAlumnos[f]=vectorAlumnos[f+1];
                    vectorAlumnos[f+1]=auxAlum;
                     
                }
            }
        }
    }
    
    public void listadoOrdenado(){
        
        imprimir("La lista de alumnos ordenados por nota de mayor a menor es; ");
        
        for(int x=0;x<vectorAlumnos.length;x++){
            
           imprimir(""+ vectorAlumnos[x] + "; NOTA: " + vectorNotas[x] + ".");
            
        }
    }
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        NotasAlunmosOrdenadas miVector = new NotasAlunmosOrdenadas();
        miVector.inicializar();
        miVector.ordenarNotas();
        miVector.listadoOrdenado();
        
    }
    
}
