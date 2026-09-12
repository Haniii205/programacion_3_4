public class ejer9 {
    public static void main(String[] args) {
        //Codifique un programa tal, que dado como entrada un arreglo unidimensional de
        //enteros y un número entero, determine cuántas veces se encuentra este número
        //dentro del arreglo.

        int[] n = {2,4,4,2,6,7,8,9,4,2,4,2,4,5,6,7,8,9,2,4};
        int numeroBuscar = 4;
        int repeticiones = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == numeroBuscar){
                repeticiones++;
            }
        }
        System.out.println("El número " + numeroBuscar + " se encuentra " + repeticiones + " veces en el arreglo.");
        System.out.println("-------------->");
    }
}
