package Matrices_clases;

public class e1 {
   
    public static void main(String[] args) {
         int[][] matriz =  {{5,8,6}, 
                            {1,3,2},
                            {4,9,7}};

        for(int i=0; i < matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print("matriz: [" + i + "][" + j + "]" + " = " + matriz[i][j] + "  ");
            }
            System.out.println();
        }
        //Visualizar de mejor manera la matriz
        String cad = "";
        for (int i = 0; i < matriz.length; i++) { //matriz.length -> siempre será para recorrer las filas
            for (int j = 0; j < matriz[0].length; j++) {   //matriz[0].length -> siempre será para recorrer las columnas impares
                cad += "|"+matriz[i][j];        
            }
            cad+="| \n";
        }
        System.out.println(cad);
    }
}
