public class ejer18 {
    public static void main(String[] args) {
        //Pregunta 18: Realice un programa que calcule la tabla de multiplicar del 1 al 10 almacenando los
        //valores en una tabla. Imprimir dicha tabla

        int[][] tablaMultiplicar = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Tabla de multiplicar:");
        System.out.println("-------------------->");
        for (int z = 0; z < 10; z++) {
            for (int x = 0; x < 10; x++) {
                System.out.print(tablaMultiplicar[z][x] + "|");
            }
            System.out.println();
            System.out.println("");
        }
    }
}
