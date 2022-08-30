package pilas;

import java.util.Stack;

public class pilas {
        
     public static void main(String[] ar) {
         
        Stack pila = new Stack();
        Stack pila2 = new Stack();
        
        pila.push("Planta Baja");
        pila.push("Primer Piso");
        pila.push("Segundo Piso");
        pila.push("Tercer Piso");
        pila.push("Terraza");
        pila.push(911);
        
        int x=0;
           
        while(pila.empty()== false){
            
            pila2.push(pila.peek());
            System.out.println(pila.pop());
            x=x+1;
        
        }
        
        while(pila2.empty()== false){

            System.out.println(pila2.pop());
                
        }
    }    
}
