
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ReporteDiario {

    String nss;             // Número de Seguridad Social del repartidor
    String entidadAnunciada; // Empresa de la propaganda

    public ReporteDiario(String nss, String entidadAnunciada) {
        this.nss = nss;
        this.entidadAnunciada = entidadAnunciada;
    }
}

class Trabajador {

    String nss;
    String nombre;
    int diasTrabajados;

    public Trabajador(String nss, String nombre, int diasTrabajados) {
        this.nss = nss;
        this.nombre = nombre;
        this.diasTrabajados = diasTrabajados;
    }
}

public class P105 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        LinkedList<Trabajador> listaTrabajadores = new LinkedList<>();
        listaTrabajadores.add(new Trabajador("111", "Andres", 5));
        listaTrabajadores.add(new Trabajador("333", "Meiling", 3));
        listaTrabajadores.add(new Trabajador("555", "Valkov", 8));

        //se crea la cola del trabajo diario (osea los que trabajaron hoy)
        Queue<ReporteDiario> colaReportes = new LinkedList<>();
        colaReportes.offer(new ReporteDiario("333", "Supermercado Ara")); // Ana trabajó hoy
        colaReportes.offer(new ReporteDiario("222", "Desconocido"));    // Empleado nuevo (va entre 111 y 333)
        colaReportes.offer(new ReporteDiario("111", "Pizzería Dominos"));    // Carlos trabajó hoy

        System.out.println("---- |ESTADO INICIAL DE LA LISTA| ----");
        mostrarLista(listaTrabajadores);

        System.out.println("\n---- |PROCESANDO REPORTES DIARIOS| ---");

        //actualiza la lista
        while (!colaReportes.isEmpty()) {
            ReporteDiario reporte = colaReportes.poll(); // Sacamos el primer reporte de la cola
            System.out.println("\nProcesando reporte de NSS: " + reporte.nss + " (Propaganda: " + reporte.entidadAnunciada + ")");

            boolean encontrado = false;

            // Buscar si ya existe en la lista
            for (Trabajador t : listaTrabajadores) {
                if (t.nss.equals(reporte.nss)) {
                    t.diasTrabajados++; //Si existe, se le suma el día
                    System.out.println("-> |Trabajador encontrado| Se aumentaron sus días a: " + t.diasTrabajados);
                    encontrado = true;
                    break;
                }
            }
            // Si no existe, se añade en la posición estructurak para mantener el orden
            if (!encontrado) { // Si no se encontró, se añade un nuevo trabajador
                System.out.println("-> NSS nuevo detectado. Ingrese el nombre para este registro:");
                System.out.print("Nombre del repartidor: ");
                String nombreNuevo = tc.nextLine();

                Trabajador nuevoTrabajador = new Trabajador(reporte.nss, nombreNuevo, 1);

                // Insertar ordenadamente por NSS
                int posicionInsercion = 0;
                for (int i = 0; i < listaTrabajadores.size(); i++) {
                    // se compara los NSS como texto o números. Si el nuevo es menor, va en la primera posicion
                    if (reporte.nss.compareTo(listaTrabajadores.get(i).nss) < 0) {
                        posicionInsercion = i;
                        break;
                    }
                    posicionInsercion = i + 1; // Si es mayor, se asume que va al final
                }
                // Agregamos en la posición exacta calculada
                listaTrabajadores.add(posicionInsercion, nuevoTrabajador);
                System.out.println("-----> se registró con éxito en la posición: " + posicionInsercion);
            }
        }
        System.out.println("\n=== ESTADO FINAL DE LA LISTA ENLAZADA ===");
        mostrarLista(listaTrabajadores);
    }

    // imprimir los trabajadores en pantalla
    public static void mostrarLista(LinkedList<Trabajador> lista) {
        for (Trabajador t : lista) {
            System.out.println("NSS: " + t.nss + " | Nombre: " + t.nombre + " | Días Trabajados: " + t.diasTrabajados);
        }
    }
}