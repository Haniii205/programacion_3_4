
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

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n=== BIENVENIDO A CINEMASTAR ===");
            System.out.println("1. Creacion de Peliculas");
            System.out.println("2. Asignacion de Funciones");
            System.out.println("3. Ventas");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion. ");
            opcion = teclado.nextInt();
            teclado.nextLine(); //Limpiar el buffer

// MENU
            switch (opcion) {
                case 1:  //Metodos
                    crearPelicula(teclado);
                    break;

                case 2:
                    asignarFuncion(teclado);
                    break;

                case 3:
                    venderBoletas(teclado);
                    break;

                case 4:
                    System.out.println("¡Gracias por usar CineMaster!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        teclado.close();
    }

// Opcion 1:
    private void crearPelicula(Scanner teclado) {
        if (cantPeliculas >= listaPeliculas.length) {
            System.out.println("No se pueden hacer más peliculas");
            return;

        }

        System.out.println("===Crear peliculas===");
        System.out.println("Nombre de la pelicula: ");
        String nombre = teclado.nextLine();

        System.out.println("Idioma: ");
        String idioma = teclado.nextLine();

        String tipo = "";
        while (!tipo.equalsIgnoreCase("2D") && !tipo.equalsIgnoreCase("3D")) {
            System.out.print("Formato (2D/3D): ");
            tipo = teclado.nextLine().trim(); // .trim() quita espacios extra por error

            if (tipo.equalsIgnoreCase("2D") || tipo.equalsIgnoreCase("3D")) {
                System.out.println("Formato guardado con éxito.");
            } else {
                System.out.println("Error: Formato no válido. Debe escribir '2D' o '3D'.\n");
            }
        }

        int duracion = 0;   //duracion negativa
        while (duracion <= 0) {
            System.out.print("Duración en minutos (debe ser mayor a 0): ");
            duracion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            if (duracion <= 0) {
                System.out.println("Error: La duración no puede ser negativa ni cero. Intente de nuevo.");
            }
        }

        listaPeliculas[cantPeliculas] = new Peliculas(nombre, idioma, tipo, duracion);
        cantPeliculas++;

        System.out.println("==Pelicula registrada correctamente==");
    }

// Opcion 2
    private void asignarFuncion(Scanner teclado) {
        if (cantPeliculas == 0) {
            System.out.println("Primero debes registrar una pelicula.");
            return;
        }
        if (cantFunciones >= listaFunciones.length) {
            System.out.println("No se pueden agregar más funciones");
            return;

        }
// Select peli

        System.out.println("\n==Seleccione una pelicula==");
        for (int i = 0; i < cantPeliculas; i++) {
            System.out.print((i + 1) + ". ");
            listaPeliculas[i].mostrar();
        }

        int selPeli = -1;
// Repetir mientras la opción esté fuera del rango válido (menor a 0 O mayor/igual a cantPeliculas)
        while (selPeli < 0 || selPeli >= cantPeliculas) {
            System.out.print("Selección (1 a " + cantPeliculas + "): ");
            selPeli = teclado.nextInt() - 1; // Convertimos de 1-N a 0-(N-1)
            teclado.nextLine(); // Limpiar el buffer

            if (selPeli < 0 || selPeli >= cantPeliculas) {
                System.out.println("Error: Opción fuera de rango. Seleccione un número entre 1 y " + cantPeliculas + ".");
            }
        }
// SALA

        System.out.println("==Seleccione una sala==");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + ". Sala " + salas[i].getNumero()
                    + (salas[i].getEs3D() ? " (3D)" : " (2D)"));
        }

        System.out.println("Seleccione: ");
        int selSala = teclado.nextInt() - 1;

        // comprobar formato 3D
        if (salas[selSala].getEs3D() && !listaPeliculas[selPeli].getTipo().equalsIgnoreCase("3D")) {
            System.out.println("Error: La Sala 3 es exclusiva para películas 3D.");
            return;
        }

        System.out.println("\n==Seleccione un horario==");
        for (int i = 0; i < horas.length; i++) {
            System.out.println((i + 1) + ". " + horas[i]);
        }

        System.out.println("Seleccione: ");
        int selHora = teclado.nextInt() - 1;

// Funcion union de los 3 objetos
        listaFunciones[cantFunciones] = new funciones(
                listaPeliculas[selPeli],
                salas[selSala],
                horas[selHora]
        );
        cantFunciones++;
        System.out.println("Función hecha con exito");
    }

//Opcion 3
    private void venderBoletas(Scanner teclado) {
        if (cantFunciones == 0) {
            System.out.println("No hay funciones disponibles.");
            return;
        }
        System.out.println("\n==Funciones disponibles==");
        for (int i = 0; i < cantFunciones; i++) {
            System.out.println((i + 1) + ". ");
            listaFunciones[i].mostrar();
        }
        System.out.println("Elige una función: ");
        int selFun = teclado.nextInt() - 1;

        funciones funcionSel = listaFunciones[selFun];

        System.out.println("\nMapa de la Sala ('L' = Libre, 'X' = Ocupada):");
        funcionSel.mostrarSala();

        System.out.print("\nIngrese el número de la Fila (0 para A, 1 para B, etc.): ");
        int fila = teclado.nextInt();

        System.out.print("Ingrese el número de la Silla (1 a 12): ");
        int columna = teclado.nextInt();

        if (funcionSel.estaDisponible(fila, columna)) {
            if (funcionSel.asignarSilla(fila, columna)) {
                int precio = funcionSel.obtenerPrecioSilla(fila);
                System.out.println("¡Silla reservada con éxito!");
                System.out.println("Total a pagar: $" + precio);
            }
        } else {
            System.out.println("Esa silla no esta disponible");
        }

    }

}
