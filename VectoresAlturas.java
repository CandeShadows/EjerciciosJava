/**
 Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 */
package vectores;

import java.util.Scanner;

public class VectoresAlturas {
    
    public float [] alturas;
    public Scanner teclado;
    public float prom;
    public int mediaAlta;
    public int mediaBaja;
    
    public void cargarAlturas(){
     
        teclado = new Scanner(System.in);
        alturas = new float[5];
        
        for(int persona=0;persona<5;persona++){
     
            imprimir("Por favor ingrese la altura del la persona: "+(persona+1)+": ");
            alturas[persona]=teclado.nextFloat();
            
        }
    }
    
    public void promedio(){
        float suma=0;
       
            for(int persona=0;persona<5;persona++){
                
                suma = alturas [persona] + suma;
                
        }
            
        prom = suma/5;
        imprimir("El promedio de las alturas es: " + prom);
    
    }
    
    public void media(){
        
        for(int persona=0;persona<5;persona++){
     
            if(alturas[persona]>prom){
                
                mediaAlta=mediaAlta + 1;
                
            }else{
                mediaBaja=mediaBaja + 1;
            }
            
        }
        imprimir("Personas por debajo del promedio, " + mediaBaja + ".");
        imprimir("Personas por arriba del promedio, " + mediaAlta + ".");
    }
    
    public void imprimir(String print){
        
        System.out.println(print);
                
    }

    public static void main(String[] args) {
        
        VectoresAlturas miVector = new VectoresAlturas();
        
        miVector.cargarAlturas();
        miVector.promedio();
        miVector.media();
      
    }

}