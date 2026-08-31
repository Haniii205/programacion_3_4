package Practicas_java;

public class ejer3 {
    public static void main(String[] args) {
        //intercalar dos arreglos
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[a.length + b.length]; //arreglo para almacenar los elementos intercalados

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        // Si quedan elementos en alguno de los arreglos, agregarlos al arreglo resultante
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        // Imprimir el arreglo intercalado
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
