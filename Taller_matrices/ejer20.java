public class ejer20 {
    public static void main(String[] args) {
        //Pregunta 20: Codificar un programa que genere una matriz 10 x 10 con ceros en la diagonal principal
        //hacia arriba
        int n = 10;
        int m = 10;
        int [][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > i){
                    matriz [i][j] = 0;
                } else {
                    matriz[i][j]= 1;
                }  
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "|");
            }
        System.out.println();
        }
    }
}