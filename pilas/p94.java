//y P5. La entrada de datos serán pares de enteros (i,j) tal que 1 ≤ abs(i) ≤ n. De
//tal forma que el criterio de selección de pila será:
//• Si i es positivo, debe insertarse el elemento j en la pila Pi.
//• Si i es negativo, debe eliminarse el elemento j de la pila Pi.
//• Si i es cero, fin del proceso de entrada.
//Los datos de entrada se introducen por teclado. Cuando termina el proceso el programa debe escribir el contenido de la n Pilas en pantalla.

import java.util.Scanner;
import java.util.Stack;

public class p94 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Stack<Integer>[] pilas = new Stack[6];

        for (int k = 1; k < 6; k++) {
            pilas[k] = new Stack<>();
        }
        System.out.println("Ingrese pares i, j. El término 0 es para terminar.");
        System.out.println("Escribir primero número del Stack: 1, 2, 3, 4, 5.");
        System.out.println("Despues de un espacio, colocar el numero del elemento a añadir.");
        
        while (true) {
            int i = tc.nextInt();

            if (i == 0) {
                break;
            }

            int j = tc.nextInt();
            if (i > 0) {
                pilas[i].push(j);

            } else {
                int n = Math.abs(i);
                Stack<Integer> aux = new Stack<>();
                boolean eliminar = false;

                while (!pilas[n].isEmpty()) {
                    int elem = pilas[n].pop();
                    if (elem == j && !eliminar) {
                        eliminar = true;
                    } else {
                        aux.push(elem);
                    }
                }
                while (!aux.isEmpty()) {
                    pilas[n].push(aux.pop());
                }
            }
        }
        System.out.println("\nContenido final:");
        for (int k = 1; k <= 6; k++) {
            System.out.println("P" + k + ": " + pilas[k]);
        }
        tc.close();
    }
}
