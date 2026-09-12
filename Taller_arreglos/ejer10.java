public class ejer10 {
    public static void main(String[] args) {
        //Pregunta 10:  Dado un arreglo A de N elementos se desea crear otro arreglo, tal que cada uno de sus
        //elementos sea la suma de los opuestos en el arreglo dado.
        
        int[] A = {1, 2, 3, 4, 5, 6}; // Ejemplo de arreglo A con N elementos
        int[] B = new int[(A.length + 1) / 2];

        for (int i = 0; i < A.length / 2; i++) {
            B[i] = A[i] + A[A.length - 1 - i];
        }
        if (A.length % 2 != 0) {
            B[B.length - 1] = A[A.length / 2];
        }

        // Imprimir el arreglo B
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + "");
            if (i < B.length - 1) {
                System.out.print("|");
            }
        }
        System.out.println("");
        System.out.println("--------------> Arreglo B");
    }
}
