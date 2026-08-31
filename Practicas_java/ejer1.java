package Practicas_java;

public class ejer1 {
    public static void main(String[] args) {
        //suma de numeros pares e impares
        int[] numeros = {3, 7, 2, 9, 4, 6, 8, 5, 1, 10};
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]%2 == 0){
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }


        }
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
}
