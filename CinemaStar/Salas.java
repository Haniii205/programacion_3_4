
public class Salas {

    private int num;
    private String[][] sillas;
    private boolean es3D;

    public Salas(int numero, boolean es3D) {
        this.num = num;
        this.es3D = es3D;
        if (num == 3) {
            sillas = new String[6][];
            for (int i = 0; i < 6; i++) {
                sillas[i] = new String[13];
                sillas[i][0] = (char) ('A' + i) + ": ";
                for (int j = 1; j < 13; j++) {
                    sillas[i][j] = "L";
                }
            }
        } else {

            sillas = new String[8][];

            for (int i = 0; i < 6; i++) {
                sillas[i] = new String[13];
                sillas[i][0] = (char) ('A' + i) + ": ";
                for (int j = 1; j < 13; j++) {
                    sillas[i][j] = "L";
                }
            }

            for (int i = 6; i < 8; i++) {
                sillas[i] = new String[10];
                sillas[i][0] = (char) ('A' + i) + ": ";
                for (int j = 1; j < 10; j++) {
                    sillas[i][j] = "L";
                }
            }
        }
    }

    public int getNumero() {
        return num;
    }

    public boolean getEs3D() {
        return es3D;
    }

    public String[][] getSillas() {
        return sillas;
    }

    public void mostrarSala() {
        //numeros de las columnas (horizontal)
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
    //hay sillas disponibles?
    public boolean estaDisponible(int fila, int columna) {
        if (fila < 0 || fila >= sillas.length) {
            return false;
        }
        if (columna < 0 || columna >= sillas[fila].length) {
            return false;
        }
        
        if (columna == 0) {
            return false;
        }
        return sillas[fila][columna].equals("L");
    }
    //asignar sillas:
     public boolean asignarSilla(int fila, int columna) {
        if (estaDisponible(fila, columna)) {
            sillas[fila][columna] = "X";
            return true;
        }
        return false;
    }
    //cuantas sillas hay libres?
     public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 1; j < sillas[i].length; j++) { // Desde 1 (la 0 es la letra)
                if (sillas[i][j].equals("L")) {
                    contador++;
                }
            }
        }
        return contador;
    }
}

