package lihue.notasalumnos;
import java.util.LinkedList;
import java.util.Scanner;

public class progNotasAlum {
    LinkedList listaAlum = new LinkedList(); //nombres todos
    LinkedList listaNota1 = new LinkedList(); //nota 1
    LinkedList listaNota2 = new LinkedList(); //nota 2
    LinkedList listaNota3 = new LinkedList(); //nota 3
    LinkedList listaPromedio = new LinkedList(); //promedio de todas las notas
    LinkedList listaApro = new LinkedList(); //lista de aprobados NOTAS
    LinkedList listaRegu = new LinkedList(); //lista de regulares NOTAS
    LinkedList listaDesap = new LinkedList(); // lista de desaprobamos NOTAS
    LinkedList listaAproAlum = new LinkedList(); //lista de aprobados NOMBRES
    LinkedList listaReguAlum = new LinkedList(); //lista de regulares NOMBRES
    LinkedList listaDesapAlum = new LinkedList(); // lista de desaprobamos NOMBRES
       //declaro todas las variables a usar
        public int auxInt01=0;
        public int auxInt02=0;
        public int auxInt03=0;
        public float auxIntProm=0;
        public String aux="";
        public Scanner teclado;
    public void inicializar(){
        imprimir("Ingrese el nombre del alumno, luego ingrese las notas una a la vez. Ingrese 0 para salir");
        //lo uso para ingresar los valores
        teclado = new Scanner(System.in);
        do{ 
            aux = teclado.next(); //ingreso el nombre, si no es 0 avanza en el algoritmo de ingresar las notas. SIno finaliza y envia el resumen de notas
            if(!aux.equals("0")){
                auxInt01 = teclado.nextInt(); //la nota1
                auxInt02 = teclado.nextInt(); //la nota2 
                auxInt03 = teclado.nextInt(); //la nota3
                //agrego a las listas
                listaAlum.add(aux);
                listaNota1.add(auxInt01);
                listaNota2.add(auxInt02);
                listaNota3.add(auxInt03);
                auxIntProm = (auxInt01 + auxInt02 + auxInt03)/3; //calculo del promedio
                listaPromedio.add(auxIntProm); //ingreso el promedio a la lista
                //evaluo el promedio para ir armando las listas de condicion del alumno
                if(auxIntProm >=7){
                    listaAproAlum.add(aux);
                    listaApro.add(auxIntProm);
               }else if((auxIntProm >=4) && (auxIntProm<=6)){
                    listaReguAlum.add(aux);
                    listaRegu.add(auxIntProm);
               }else{
                    listaDesapAlum.add(aux);
                    listaDesap.add(auxIntProm); 
                }
            }
        }while(!"0".equals(aux));
        imprimir("Carga finalizada");
    }
    public void informeDeNotas(){
        
        //lo for para recorrer las listas e imprimirlas.
        for(int x=0; x< listaAlum.size(); x++){
           imprimir("El alumno: " + listaAlum.get(x));
           imprimir("Tiene las siguientes notas: ");
           imprimir(""+listaNota1.get(x));
           imprimir(""+listaNota2.get(x));
           imprimir(""+listaNota3.get(x));
           imprimir("Su promedio es: " + listaPromedio.get(x));
           imprimir("");
        }
        imprimir("Lista de alumnos aprobados y sus promedios");
        for(int f=0; f< listaAproAlum.size(); f++){
            imprimir("Alumno: " + listaAproAlum.get(f) + ", promedio: " +listaApro.get(f));
        }
        imprimir("Lista de alumnos regulares y sus promedios");
        for(int g=0; g< listaReguAlum.size(); g++){
            imprimir("Alumno: " + listaReguAlum.get(g) + ", promedio: " +listaRegu.get(g));
        }
        imprimir("Lista de alumnos desprobados y sus promedios");
        for(int h=0; h< listaDesapAlum.size(); h++){
            imprimir("Alumno: " + listaDesapAlum.get(h) + ", promedio: " +listaDesap.get(h));
        }
    }
    public void imprimir(String print){
        System.out.println(print);
    } 
    public static void main(String[] args) {
       progNotasAlum listasDeAlum = new progNotasAlum();
       listasDeAlum.inicializar();
       listasDeAlum.informeDeNotas();
    }       
}