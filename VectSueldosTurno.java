/*
Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde)
Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados por turno.
Imprimir los gastos en sueldos de cada turno.
*/
package vectores;

import java.util.Scanner;

public class VectSueldosTurno {
        
    private Scanner teclado;
    private float [] turnoManana;
    private float [] turnoTarde;
    
    public void cargarSueldo() {
    
        teclado=new Scanner(System.in);
        turnoManana=new float[4];
        turnoTarde=new float[4];
        
        imprimir("Sueldos de empleados del turno de la mañana:");
        
        for(int x=0; x<4; x++) {
        
            imprimir("Ingrese sueldo el empleado N°: " + (x+1));
            turnoManana[x]=teclado.nextFloat();
        
        }
        
        imprimir("Sueldo de empleados del turno de la tarde:");
        
        for(int x=0; x<4; x++){
            
            imprimir("Ingrese sueldo el empleado N°: "+ (x+1));
            turnoTarde[x]=teclado.nextFloat();
        
        }
    }
        
        public void cargarGastos() {
            
            float manana=0;
            float tarde=0;
            
            for(int x=0; x<4; x++) {
                manana = manana + turnoManana[x];
                tarde = tarde + turnoTarde[x];
            }
            
            imprimir("total de gastos del turno de la mañana:" + manana);
            imprimir("total de gastos del turno de la tarde:" + tarde);

        }
        
    public void imprimir(String print){
        
        System.out.println(print);
                
    }    
    
    public static void main(String[] args) {
        
        VectSueldosTurno miVector = new VectSueldosTurno();
        
        miVector.cargarSueldo();
        miVector.cargarGastos();
        
    }
    
}
