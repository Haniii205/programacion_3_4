public class ejer12 {
    public static void main(String[] args) {
        //Pregunta 12: Dado un arreglo A de N elementos se quiere generar otro arreglo que contenga las
        //posiciones de los elementos del arreglo dado que sean iguales a un valor x dado.
        int[] A = {1, 2, 3, 4, 5, 2, 6}; // Ejemplo de arreglo A con N elementos
        int x = 2; // Valor a buscar en el arreglo A
        int[] B = new int[A.length];
        int contPosiciones = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                B[contPosiciones] = i;
                contPosiciones++;
            }
        }

        // Imprimir las posiciones encontradas
        System.out.print("Posiciones de los elementos iguales a " + x + ": ");
        for (int i = 0; i < contPosiciones; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println("-------------->");
    }
}
