package Practicas_java;

public class ejer2 {
    public static void main(String[] args) { 
        //encontrar el numero que mas se repite
        int[] n = {4, 2, 7, 4, 9, 2, 4, 6, 7, 4, 2, 5};

        for (int i = 0; i < n.length; i++) {
            int total = 0; //contador de repeticiones
            for (int j = 0; j < n.length; j++) {
                if (n[i] == n[j]) { //comparar el elemento actual con todos los elementos del arreglo
                    total++; //incrementar el contador si se encuentra una coincidencia
                }
            }
            if (total > 1) { //si el contador es mayor a 1, significa que el número se repite
                System.out.println("El número " + n[i] + " se repite " + total + " veces.");
            }
        }
    }
}

