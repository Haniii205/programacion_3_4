public class Salas {

    private int num;
    private boolean es3D;

    public Salas(int numero, boolean es3D) {
        this.num = numero;
        this.es3D = es3D;
    }

    public int getNumero() {
        return num;
    }

    public boolean getEs3D() {
        return es3D;
    }

    // Devuelve una matriz de sillas limpia para asignársela a una nueva función
    public String[][] crearMatrizSillas() {
        String[][] sillas;
        
        if (this.num == 3) {
            // Sala 3: 6 filas (A a F) de 12 sillas
            sillas = new String[6][13];
            for (int i = 0; i < 6; i++) {
                sillas[i][0] = (char) ('A' + i) + ":";
                for (int j = 1; j < 13; j++) {
                    sillas[i][j] = "L";
                }
            }
        } else {
            // Salas 1 y 2: 6 filas generales (A-F) + 2 filas preferenciales (G-H)
            sillas = new String[8][];
            for (int i = 0; i < 6; i++) {
                sillas[i] = new String[13];
                sillas[i][0] = (char) ('A' + i) + ":";
                for (int j = 1; j < 13; j++) {
                    sillas[i][j] = "L";
                }
            }
            for (int i = 6; i < 8; i++) {
                sillas[i] = new String[10];
                sillas[i][0] = (char) ('A' + i) + ":";
                for (int j = 1; j < 10; j++) {
                    sillas[i][j] = "L";
                }
            }
        }
        return sillas;
    }
}