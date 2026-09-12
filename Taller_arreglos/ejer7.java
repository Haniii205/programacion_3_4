public class ejer7 {
    public static void main(String[] args) {
        //Pregunta 7: Obtener dos arreglos tal que sus elementos sean los números pares y números
        //impares del arreglo A de 10 elementos.

        int[] A = {2,5,7,3,9,11,23,45,12,14};
        int[] pares = new int[A.length];
        int[] impares = new int[A.length];
        int PosPares = 0;
        int PosImpares = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pares[PosPares] = A[i];
                PosPares++;
            } else {
                impares[PosImpares] = A[i];
                PosImpares++;
            }
        }
        System.out.println("Arreglo de números pares:");
        for (int i = 0; i < PosPares; i++) {
            System.out.print(pares[i] + ", ");
        }
        System.out.println();
        System.out.println("-------------->");
        System.out.println("Arreglo de números impares:");
        for (int i = 0; i < PosImpares; i++) {
            System.out.print(impares[i] + ", ");
        }
        System.out.println();
        System.out.println("-------------->");
    }
}

