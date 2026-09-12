public class ejer8 {
    public static void main(String[] args) {
        //Pregunta 8: Elaborar un programa que lea 30 números y que imprima el número mayor, menor y el
        //número de veces que se repiten ambos.
        int[] numeros = new int[30];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int vecesMayor = 0;
        int vecesMenor = 0;   
        int repeticiones = 0;  

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            System.out.println("Arreglo [" + i + "]: " + numeros[i]);
           
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == mayor) {
                vecesMayor++;
                repeticiones++;
            }
            else if (numeros[i] == menor) {
                vecesMenor++;
                repeticiones++;
            }
        }

        System.out.println("--------------------->");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("El número mayor se repite " + vecesMayor + " veces");
        System.out.println("El número menor se repite " + vecesMenor + " veces");
        System.out.println("Total de repeticiones: " + repeticiones);
        System.out.println("--------------------->");
    }
}