public class ejer21 {
    public static void main(String[] args) {
        //Pregunta 21: Dada una matriz de M*M elementos, hacer un programa que construya un vector B,
        //donde cada uno de sus componentes sea la suma de los elementos de valores
        //numéricos pares de las filas de la matriz.

        int [][] matriz =  
        {{2, 4, 6},
         {3, 6, 7},       
         {8, 9, 0}};

        int M = matriz.length;                    
        int[] B = new int[M];
        
        for (int i = 0; i < M; i++) {
            int sumaPares = 0;   
            for (int j = 0; j < M; j++) {
                if (matriz [i][j] % 2 == 0){
                    sumaPares += matriz [i][j];
                }
        B[i]= sumaPares;        
        }
    }
    
        System.out.println("Matriz A: ");
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j]+ "|");
      }
      System.out.println();
    }
    System.out.println("--------------->");
    System.out.println("Matriz B (suma de pares): ");
        for (int i = 0; i < M; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}