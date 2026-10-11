//Escribir un programa que, haciendo uso de una Pila, procese cada uno de los caracteres de una expresión que viene dada en una línea. La finalidad es verificar el
//equilibrio de paréntesis, llaves y corchetes. Por ejemplo, la siguiente expresión tiene
//un número de paréntesis equilibrado:
//((a+b)*5) - 7

import java.util.Stack;
public class p93 {
    public static boolean ej(String expresion) {
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            
            // Si abre, se mete a la pila
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            // Si cierra, se verifica
            else if (c == ')' || c == ']' || c == '}') {
                // Si la pila está vacía, hay un cierre sin apertura
                if (pila.isEmpty()) {
                    return false;
                }
                
                char tope = pila.pop();
                
                // Verificar que el cierre coincida con la apertura ( y )
                if (c == ')' && tope != '(') return false;
                if (c == ']' && tope != '[') return false;
                if (c == '}' && tope != '{') return false;
            }
        }
        
        // Al final, la pila debe estar vacía
        return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        String expresion = "2*[(a+b)/2.5 + x - 7*y"; //((a+b)*5) - 7
        
        if (ej(expresion)) {
            System.out.println("La expresión está equilibrada.");
        } else {
            System.out.println("La expresión no ta equilibrada.");
        }
    }
}
