package repaso_pilas;
//Obtener una secuencia de 10 números reales, guardarlos en un array y ponerlos en
//una pila. Imprimir la secuencia original y, a continuación, imprimir la pila extrayendo
//los elementos.

import java.util.Stack;

public class punto3 {
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.0, 4.6, 2.1, 8.3, 5.7, 6.4, 0.9};
        Stack<Double> pila = new Stack<>();

        // Guardar los números en la pila
        for (double numero : numeros) {
            pila.push(numero);
        }

        // Imprimir la secuencia original
        System.out.println("Secuencia original:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Imprimir la pila extrayendo los elementos
        System.out.println("Elementos de la pila:");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }
    }
}
