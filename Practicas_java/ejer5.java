package Practicas_java;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        //Menu de operaciones con arreglos

        Scanner tc = new Scanner(System.in);
        int[] numeros = new int[0]; // Inicializar un arreglo vacío
        String ingresar;

        while (true) {
            System.out.println("---Menu de operaciones con arreglos:---");
            System.out.println("1) Agregar un numero.");
            System.out.println("2) Mostrar todos los numeros.");
            System.out.println("3) Mostrar el numero mayor.");
            System.out.println("4) Mostrar el numero menor.");
            System.out.println("5) Eliminar el ultimo numero.");
            System.out.println("6) Salir.");
            ingresar = tc.nextLine().toLowerCase();

            switch (ingresar) {
                case "1":
                    //Agregar un numero
                    System.out.println("Ingrese un numero: ");
                    int numero = tc.nextInt();
                    tc.nextLine(); // Limpiar el buffer

                    // Crear un nuevo arreglo con 1 espacio más
                    int[] nuevo = new int[numeros.length + 1];
                    
                    // Copiar los elementos viejos
                    for (int i = 0; i < numeros.length; i++) {
                        nuevo[i] = numeros[i];
                    }
                    
                    // Agregar el nuevo número al final
                    nuevo[numeros.length] = numero;
                    numeros = nuevo; // Actualizar la referencia
                    
                    System.out.println("¡Número " + numero + " agregado!");
                    break;

                case "2":
                    //Mostrar todos los numeros
                    System.out.println("-Mostrando todos los numeros-");
                    System.out.println("Numeros en el arreglo: ");
                    if (numeros.length == 0) {
                        System.out.println("El arreglo está vacío.");
                    } else {
                        System.out.print("Elementos en el arreglo: ");
                        for (int i = 0; i < numeros.length; i++) {
                            System.out.print(numeros[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    //Mostrar el numero mayor
                    if (numeros.length == 0) {
                        System.out.println("El arreglo está vacío.");
                    } else {
                        int max = numeros[0];
                        for (int i = 1; i < numeros.length; i++) {
                            if (numeros[i] > max) {
                                max = numeros[i];
                            }
                        }
                        System.out.println("El número mayor es: " + max);
                    }
                    break;
                case "4":
                    //Mostrar el numero menor
                    if (numeros.length == 0) {
                        System.out.println("El arreglo está vacío.");
                    } else {
                        int min = numeros[0];
                        for (int i = 1; i < numeros.length; i++) {
                            if (numeros[i] < min) {
                                min = numeros[i];
                            }
                        }
                        System.out.println("El número menor es: " + min);
                    }
                    break;
                case "5":
                    //Eliminar el ultimo numero
                    if (numeros.length == 0) {
                        System.out.println("El arreglo está vacío. No hay elementos para eliminar.");
                    } else {
                        int[] temp = new int[numeros.length - 1];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = numeros[i];
                        }
                        numeros = temp;
                        System.out.println("¡Último número eliminado!");
                    }
                    break;
                case "6":
                    //Salir
                    System.out.println("¡Saliendo del programa!");
                    tc.close();
                    return;
                default:
                    throw new AssertionError(); 
            }
        }
    }
}