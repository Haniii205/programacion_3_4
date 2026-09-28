public class funciones {
    private Peliculas pelicula;
    private Salas sala;
    private String hora;
    private String[][] sillas;

    public funciones(Peliculas pelicula, Salas sala, String hora) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.hora = hora;
        this.sillas = sala.crearMatrizSillas(); // Cada función administra su propio sistema de sillas
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public Salas getSala() {
        return sala;
    }

    public String getHora() {
        return hora;
    }

    public void mostrar() {
        System.out.println(pelicula.getNombre() + " - Sala " + sala.getNumero() + " - " + hora);
    }

    public void mostrarSala() {
        System.out.print("     ");
        for (int j = 1; j <= 12; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();

        for (int i = 0; i < sillas.length; i++) {
            if (i == 6) {
                System.out.println("<>------------------ PREFERENCIAL ------------------<>");
            }
            for (int j = 0; j < sillas[i].length; j++) {
                System.out.print(sillas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean estaDisponible(int fila, int columna) {
        if (fila < 0 || fila >= sillas.length) return false;
        if (columna < 1 || columna >= sillas[fila].length) return false;
        return sillas[fila][columna].equals("L");
    }

    public boolean asignarSilla(int fila, int columna) {
        if (estaDisponible(fila, columna)) {
            sillas[fila][columna] = "X";
            return true;
        }
        return false;
    }

    public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 1; j < sillas[i].length; j++) {
                if (sillas[i][j].equals("L")) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int obtenerPrecioSilla(int fila) {
        if (sala.getNumero() == 3) {
            return 10000; // Tarifa Sala 3 (3D)
        } else if (fila >= 6) {
            return 12000; // Tarifa Preferencial
        } else {
            return 8000;  // Tarifa General
        }
    }
}