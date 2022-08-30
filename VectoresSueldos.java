/**
Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
Empleando un vector solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
 */
package vectores;

import java.util.Scanner;

public class VectoresSueldos {
    
    public float [] sueldos;
    public Scanner teclado;
    
    public void cargarSueldos(){
       //defino el ingreso de los valores ´por teclado
        teclado = new Scanner(System.in);
        //defino el vector sueldos
        sueldos = new float[5];
        
        for(int operario=0;operario<5;operario++){
             //pido el ingreso de los sueldos y los guardo en el vector definido
             System.out.print("Por favor ingrese el valor del sueldo del operario: "+(operario+1)+": ");
             sueldos[operario]=teclado.nextFloat();
        }
    }
    
    public void imprimir(){
            for(int operario=0;operario<5;operario++){
            //imprimo los sueldos correspondientes a cada operario.
            System.out.println("El sueldo del operario "+(operario+1)+" es: "+ sueldos[operario]);
            }
    }

    public static void main(String[] args) {
        
        //defino mi objeto vector
        VectoresSueldos miVector = new VectoresSueldos();
        //llamo a las funciones
        miVector.cargarSueldos();
        miVector.imprimir();
    }
    
}
