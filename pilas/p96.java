
import java.util.Scanner;
import java.util.Stack;

public class p96 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase = tc.nextLine();
        frase = frase.replace(" ", "").toLowerCase();

        Stack<Character> pila = new Stack<>();

        Fra primero = null;
        Fra ultimo = null;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            pila.push(c);

            Fra nuevo = new Fra(c);
            if (primero == null) {
                primero = nuevo;
                ultimo = nuevo;
                nuevo.siguiente = primero;
            } else {
                ultimo.siguiente = nuevo;
                ultimo = nuevo;
                ultimo.siguiente = primero;
            }
        }
        boolean esPalindromo = true;
        Fra actual = primero;

        while (!pila.isEmpty()) {
            char dePila = pila.pop();
            char deLista = actual.dato;

            if (dePila != deLista) {
                esPalindromo = false;
                break;
            }
            actual = actual.siguiente;
        }

        if (esPalindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("Non es palíndromo");
        }

        tc.close();
    }

    static class Fra {

        char dato;
        Fra siguiente;

        Fra(char dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
}
