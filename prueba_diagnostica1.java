
public class prueba_diagnostica1 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println("---Clasificacion de numeros pares e impares---");

        for (int num: n){
        if (num % 2 == 0) {
            System.out.println("El numero: "+ num + " es par");
        } else {
            System.out.println("El numero: " + num + " es impar");
        }
    }
    System.out.println("---Fin de la clasificacion---");
}
}
