package Matrices_ejer_autonomos;

public class ejer4 {
    public static void main(String[] args) {
        //Transpuesta de una matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) { //analiza la matriz original y va llenando la transpuesta
            for (int j = 0; j < matriz[i].length; j++) { //almacena los valores de la matriz original en la transpuesta
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < transpuesta.length; i++) { //imprime la matriz transpuesta
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
