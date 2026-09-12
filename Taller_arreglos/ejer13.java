public class ejer13 {
    public static void main(String[] args) {
        //Pregunta 13: Dado un arreglo A de N elementos se desea almacenar los elementos mayores y
        //menores que la media, almacenarlos en vectores diferentes.
        int[] A = {1,5,7,8,9,0,3,4,2,6}; // Ejemplo de arreglo A con N elementos
        int suma = 0;
        for (int i = 0; i < A.length; i++) {
            suma += A[i];
        }
        double media = (double) suma / A.length;
        System.out.println("Media: " + media);

        int[] mayores = new int[A.length];
        int[] menores = new int[A.length];
        int contMayores = 0;
        int contMenores = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > media) {
                mayores[contMayores++] = A[i];
            } else if (A[i] < media) {
                menores[contMenores++] = A[i];
            }
        }
        System.out.println("Elementos mayores que la media:");
        for (int i = 0; i < contMayores; i++) {
            System.out.print(mayores[i] + " ");
        }
        System.out.println();
        System.out.println("Elementos menores que la media:");
        for (int i = 0; i < contMenores; i++) {
            System.out.print(menores[i] + " ");
        }
        System.out.println();
        System.out.println("-------------->");
    }
}