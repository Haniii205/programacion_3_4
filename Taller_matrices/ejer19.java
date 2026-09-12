public class ejer19 {
    public static void main(String[] args) {
        //Pregunta 19: Codificar un programa que genere un matriz de n x m, en la cual asigne ceros a todos
        ///los elementos, excepto a los de la diagonal principal donde se asignarán unos
    int n = 5;
    int m = 5;
    int[][] matriz = new int[n][m];
    
    //el 0
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[i][j] = 0;
        }
    }
    //el 1
    for (int z = 0; z < n; z++) {
        matriz[z][z] = 1; //aprendi q cualquier varible igual es diagonal uuuh
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matriz[i][j] + "|");
        }
        System.out.println();
        System.out.println("---------");
        }
    }
}
