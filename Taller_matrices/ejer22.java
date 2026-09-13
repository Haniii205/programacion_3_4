import java.util.Scanner;

public class ejer22 {
    public static void main(String[] args) {
        //Pregunta 22:  Escribir un programa que lea las dimensiones de una matriz, lea y visualice la matriz y a
        //continuación encuentre el mayor y menor elemento de la matriz y sus posiciones.
    
        Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = tc.nextInt();
        System.err.print("Ingrese el numero de columnas: ");
        int columnas = tc.nextInt();

        int [][] matriz = new int [filas][columnas];

        System.out.println();
        System.out.println("Ingrese los elementos de la matriz dicha: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz [i][j] = tc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriz Ingresada: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        int mayor = matriz [0][0];
        int menor = matriz [0][0];
        int filaMa = 0;
        int filaMe = 0;
        int columnaMa = 0;
        int columnaMe = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor)  {
                    mayor = matriz[i][j];
                    filaMa = i;
                    columnaMa = j;
                }
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                    filaMe = i;
                    columnaMe = j;
                }         
                }
            }
        System.out.println();
        System.out.print("El mayor elemento de la matriz es: " + mayor + ", en la posicion: [" + filaMa + "]["+ columnaMa + "]");
        System.out.println();
        System.out.print("El mayor elemento de la matriz es: " + menor + ", en la posicion: [" + filaMe + "]["+ columnaMe + "]");
        System.out.println();
        System.out.print("--------------> ");

        tc.close();
    }
    }