package repaso_pilas;
import java.util.Stack;
//Escribir el método mostarPila() para escribir los elementos de una pila de cadenas
//de caracteres, utilizando sólo las operaciones básicas y una pila auxiliar.
public class punto1 {
    public static void main(String[] args) {
        Stack <String> pila = new Stack <>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        
        mostrarPila(pila);
    }
   public static void mostrarPila(Stack<String> pila) {
        Stack<String> auxiliar = new Stack<>();

        System.out.println("Elementos de la pila:");
        //mientras pila no esté vacia
        //true o -false- emp
        while (!pila.isEmpty()) {
            String elemento = pila.pop();
            System.out.println(elemento);
            auxiliar.push(elemento);
        }
        
        // Devuelve los elementos a la pila original
        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }
    }
}
