
import java.util.Scanner;

public class ejer24 {
    public static void main(String[] args) {
        //Pregunta 24: Se tiene la producción total de toneladas de cereales (arroz, avena, cebada, trigo)
//cosechadas durante cada mes del año anterior. Elaborar un programa que proporcione
//la siguiente información:
//a. El promedio anual de toneladas cosechadas.
//b. Cuántos meses tuvieron una cosecha superior al promedio anual?
//c. Cuántos meses tuvieron una cosecha inferior al promedio anual?
//d. Cuál fue el mes en que se produjeron mayor número de toneladas?
    
//este ejercicio lo hice mejor con scanner pq no sabia exactamente si añadir numeros predeterminados o aleatorios.

        Scanner tc = new Scanner (System.in);
        int[][] produccion = new int [12][4];
        int mesesSuper = 0;
        int mesesInfer = 0;
        int[] totalporMes = new int [12]; //total de cada mes
        int sumaT = 0;
        double promedio;

        String[] cereales = {"Arroz", "Avena", "Cebada", "Trigo"};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre"};
        
        System.out.println("Ingresos de produccion anual de cereales: ");
        for (int i = 0; i < produccion.length; i++) {
            System.out.println("------------------------");
            System.out.println("Mes de " + meses [i] + ". ");
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.println("Toneladas de " + cereales[j] + ": ");
                produccion [i][j] = tc.nextInt();
                sumaT += produccion [i][j];
                totalporMes [i] += produccion [i][j];
            }
        }
        promedio = (double) sumaT / 48;
        System.out.println();
        System.out.println("El promedio anual de toneladas: " + promedio);

        System.out.println();
        for (int k = 0; k < totalporMes.length; k++) {
            if (totalporMes[k]>promedio) {
                mesesSuper++;
                    } else if (totalporMes [k] < promedio){
                mesesInfer++;
                } 
            }
            System.out.println("Cantidad con mas produccion superior al promedio es: " + mesesSuper);
            System.out.println("Cantidad con menos produccion inferior al promedio es: " + mesesInfer);

            int mesMayor = 0;
            int mayorPro = totalporMes[0];
            for (int i = 0; i < totalporMes.length; i++) {
                if (totalporMes[i]> mayorPro) {
                    mayorPro = totalporMes[i];
                    mesMayor = i;
                    
                }          
            }
            System.out.println();
            System.out.println("El mes con mayor produccion fue " + meses[mesMayor] + " con " + mayorPro + " toneladas.");
            System.out.println();
            System.out.println("................");
        
        tc.close();
    }
}
