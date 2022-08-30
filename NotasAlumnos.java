/*
Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B.
Cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general. 
*/
package vectores;

import java.util.Scanner;

public class NotasAlumnos {
    
    Scanner teclado;
    
	float[]cursoA;
	float[]cursoB;
    
    public void inicializar(){
	
        teclado = new Scanner(System.in);
        cursoA = new float[5];
        cursoB = new float[5];
		
        for(int x=0;x<5;x++){
            
            imprimir("Ingrese la Nota N°" + (x+1) + " del curso A:");
            cursoA[x]=teclado.nextFloat();
        
        }
        
        for(int x=0;x<5;x++){
        
            imprimir("Ingrese la Nota N°" + (x+1) + " del curso B:");
            cursoB[x]=teclado.nextFloat();
        
        }
    }
    public void promedio(){
        
        float promCursoA=0;
        float promCursoB=0;
        int x;
        
        for(x=0;x<5;x++){
            
            promCursoA=promCursoA + cursoA[x];
            promCursoB=promCursoB + cursoB[x];
        
        }
        
        promCursoA = promCursoA / x;
        promCursoB = promCursoB / x;
       
        if(promCursoA>promCursoB)
            imprimir("El Promedio del Curso A es Mayor a Curso B");
        if(promCursoA<promCursoB){
            imprimir("El Promedio del Curso B es Mayor a Curso A");
        }else
            imprimir("Los promedios de los cursos son iguales");
            imprimir("");
            imprimir("El promedio del curso A es: " + promCursoA);
            imprimir("El promedio del curso B es: " + promCursoB);
    }
    public void imprimir(String print){
        
        System.out.println(print);
                
    }
    
    public static void main(String[] args) {
        
        NotasAlumnos miVector = new NotasAlumnos();
        miVector.inicializar();
        miVector.promedio();
    
    }
}
