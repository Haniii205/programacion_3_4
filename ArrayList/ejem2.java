
import java.util.ArrayList;
import java.util.List;

public class ejem2 {

    
        private static final int MAX_espacio = 36;
        private static List<String> inventario = new ArrayList<>();

        public static void recogerObjeto(String objetoNuevo) {
        if (inventario.size() < MAX_espacio) {
            inventario.add(objetoNuevo);
            System.out.println("---> Objeto añadido. " + objetoNuevo);
        } else {
            System.out.println("-> [INVENTARIO LLENO]: No se pudo guardar: " + objetoNuevo);
        }
    }
        
        public static void main(String[] args) {
        if (inventario.isEmpty()) {
            System.out.println("|Inventario de inicio.|");
        }
        List<String> cofre = new ArrayList<>();
        cofre.add("Manzana Dorada");
        cofre.add("Lingote de Oro");
        cofre.add("Diamante");

        System.out.println("\nEl jugador está interactuando con el cofre que acaba de encontrar.");
        System.out.println("Cofre: " + cofre);

        for (String item : cofre) {
            recogerObjeto(item);
        }
        System.out.println("Objetos obtenidos del cofre: " + inventario);

        System.out.println("\nEl jugador está en la mesa de crafteo.");
        int posiDiamante = inventario.indexOf("Diamante");

        if (posiDiamante != -1) {
            System.out.println("Se localizó el objeto: " + posiDiamante);
            System.out.println("Señalando objeto en la posicion: " + (posiDiamante + 1));
            System.out.println("El jugador creó una pala de Diamante con el objeto que localizó.");
            inventario.set(posiDiamante, "Pala de Diamante");
        } else {
            System.out.println("No se pudo craftear al no encontrar el diamante. ");
        }

        int posiComida = inventario.indexOf("Manzana Dorada");
        if (posiComida != -1) {
            String comida = inventario.get(posiComida);
            System.out.println("\nEl jugador tiene hambre y se come: " + comida);
            inventario.set(posiComida, "|   |");
            System.out.println("Inventario actualizado: " + inventario);
        } else {
            System.out.println("No hay comida en el inventario.");

            
            }
            System.out.println("\nUn creeper voló por los aires al jugador.");
            inventario.clear();

            if(inventario.isEmpty()){
                System.out.println("Inventario vaciado: " + inventario);
                System.out.println("Reapareciendo al jugador.");
                System.out.println("Jugador ha reaparecido.");
        }
    }
}
