package repaso_pilas;

import java.util.Stack;

//Escribir un método, copiarPila(), que copie el contenido de una pila en otra. El
//método tendrá dos argumentos de tipo pila, uno para la pila fuente y otro para la pila
//destino. Utilizar las operaciones definidas sobre el TAD Pila. 
public class punt {
    public static void copiarPila(Stack<String> fuente, Stack<String> destino) {
        Stack<String> auxiliar = new Stack<>();
        
        //pasar todo de fuente a auxiliar
        while (!fuente.isEmpty()) {
            auxiliar.push(fuente.pop());
        }
        
        //pasar de auxiliar a fuente y destino
        while (!auxiliar.isEmpty()) {
            String elemento = auxiliar.pop();
            fuente.push(elemento);
            destino.push(elemento);
        }
    }
    
    public static void main(String[] args) {
        Stack<String> fuente = new Stack<>();
        fuente.push("A");
        fuente.push("B");
        fuente.push("C");
        fuente.push("D");
        
        Stack<String> destino = new Stack<>();
        
        copiarPila(fuente, destino);
        
        System.out.println("Fuente: " + fuente);
        System.out.println("Destino: " + destino);
    }
}
    