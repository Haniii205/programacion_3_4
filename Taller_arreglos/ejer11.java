public class ejer11 {
    public static void main(String[] args) {
        //Pregunta 11: Dado un arreglo A de N elementos se desea generar tres arreglos que contengan los
        //elementos negativos, cero y positivos de arreglo inicial
        int[] A = {1, -2, 3, 0, -4, 5};
        int[] negativos = new int[A.length];
        int[] ceros = new int[A.length];
        int[] positivos = new int[A.length];
        int contNegativos = 0;
        int contCeros = 0;
        int contPositivos = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                negativos[contNegativos++] = A[i];
            } else if (A[i] == 0) {
                ceros[contCeros++] = A[i];
            } else {
                positivos[contPositivos++] = A[i];
            }
        }

        // Imprimir los arreglos generados
        System.out.print("Negativos: ");
        for (int i = 0; i < contNegativos; i++) {
            System.out.print(negativos[i] + " ");
        }
        System.out.println();

        System.out.print("Ceros: ");
        for (int i = 0; i < contCeros; i++) {
            System.out.print(ceros[i] + " ");
        }
        System.out.println();

        System.out.print("Positivos: ");
        for (int i = 0; i < contPositivos; i++) {
            System.out.print(positivos[i] + " ");
        }
        System.out.println();
        System.out.println("-------------->");
    }
}
