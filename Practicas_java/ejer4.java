package Practicas_java;

public class ejer4 {
    public static void main(String[] args) {
        //invertir un arreglo sin otro arreglo
        int[] a = {10, 20, 30, 40, 50, 60};
        int n = a.length; // Obtener la longitud del arreglo
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i]; // Intercambiar el elemento actual con su correspondiente desde el final del arreglo
            a[n - 1 - i] = temp; 
        }
        // Imprimir el arreglo invertido
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}