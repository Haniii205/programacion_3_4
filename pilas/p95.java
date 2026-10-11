
import java.util.Scanner;
import java.util.Stack;
public class p95 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Stack<Integer>[] pilas = new Stack[6];

        for (int k = 1; k < 6; k++) {
            pilas[k] = new Stack<>();
        }
        System.out.println("Ingrese pares i, j, k. El término 0 es para terminar.");
        System.out.println("Si es positivo el primer digito, se añade, sino se elimina.");
        System.out.println("Lo mismo en el ultimo digito.");
        System.out.println("Escribir primero número del Stack: 1, 2, 3, 4, 5.");
        System.out.println("Despues de un espacio, colocar dos numeros mas de los \nelementos a añadir (dos espacios).");
        
        while (true) {
            int i = tc.nextInt();

            if (i == 0) {
                break;
            }
            int j = tc.nextInt();
            int kAccion = tc.nextInt();

            if (i > 0) {
                // Si i es positivo, añadimos el elemento j a la pila i
                pilas[i].push(j);

            } else {
                int n = Math.abs(i);
                
                // Evaluamos el valor de k
                if (kAccion == -1) {
                    //Borrar tdos los elementos de la pila de forma inmediata
                    pilas[n].clear(); 
                } 
                else if (kAccion == 0) {
                    //borrar solo la primera aparición de j
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
    }
        System.out.println("\nContenido final:");
        for (int k = 1; k <= 6; k++) {
            System.out.println("P" + k + ": " + pilas[k]);
        }
        tc.close();
    }
}

