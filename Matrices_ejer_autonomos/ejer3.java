package Matrices_ejer_autonomos;

public class ejer3 {
    public static void main(String[] args) {
        //Diagonal principal y secundaria
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("La suma de la diagonal principal es: " + sumaPrincipal);
        System.out.println("La suma de la diagonal secundaria es: " + sumaSecundaria);
    }
}