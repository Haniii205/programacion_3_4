public class ejer17 {
    public static void main(String[] args) {
        //Pregunta 17: Sumar los elementos de cada fila 
        // //y cada columna de una matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        System.out.println("Suma de cada fila:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
        
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }
        System.out.println("-------------->");
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
        System.out.println("-------------->");
    }
}
