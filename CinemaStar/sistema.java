
import java.util.Scanner;

public class sistema {

    private Peliculas[] listaPeliculas = new Peliculas[100]; //lista de las pelis permitidas
    private int cantPeliculas = 0; //cantidadd donde se guardan las pelis
    private funciones[] listaFunciones = new funciones[9]; //3 salas por 3 horas
    private int cantFunciones = 0;
    private Salas[] salas = new Salas[3]; //se crea las salas 1,2 y 3
    private String[] horas = {"14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00"}; //horas de las funciones
public sistema() {
        // se inician las 3 salas del teatro
        //esto de aqui viene de la clase salas nene
        salas[0] = new Salas(1, false); //no es 3d
        salas[1] = new Salas(2, false); //no es 3d
        salas[2] = new Salas(3, true); //solo pelis 3D, si es 3d
}
    public void menuPrincipal() {

        Scanner tc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n=== BIENVENIDO A CINEMASTAR ===");
            System.out.println("1. Creacion de Peliculas");
            System.out.println("2. Asignacion de Funciones");
            System.out.println("3. Ventas");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion. ");
            //recuerda colocar las condiciones de teclado para cerrar o continuar
            //aqui haces que todas las clases conecten segun lo pedido, la compra de boletas
            //las sillas, las funciones para asignar y lito
        }
    }
}
