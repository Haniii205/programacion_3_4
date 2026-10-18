
import java.util.ArrayList;
import java.util.List;

public class ejem1 {

    public static void main(String[] args) {
        List<String> inventario = new ArrayList<>();
        int MAX_espacio = 36;
        System.out.println("---Inventario---");

        inventario.add("Espada de Piedra");
        inventario.add("Pico de Madera");
        inventario.add("Antorcha");
        inventario.add("Manzana");
        inventario.add("Bloque de Tierra");
        inventario.add("Hacha de Hierro");
        System.out.println("Inventario: " + inventario);

        System.out.println("\nEspacios utilizados: " + inventario.size());

        if (inventario.contains("Antorcha")) {
            System.out.println("Puedes colocar antorchas para iluminar zonas oscuras.");
        }
        if (inventario.size() >= 6) {
            String herramienta1 = inventario.get(0);
            String herramienta2 = inventario.get(1);
            String herramienta3 = inventario.get(5);
            System.out.println("\n|Teclas 1, 2, 3| \nHerramienta equipada: " + herramienta1
                    + "\nHerramienta equipada: " + herramienta2 + "\nHerramienta equipada: " + herramienta3);
        } else {
            System.out.println("Espacio vacio.");
        }
        inventario.set(2, "|   |");
        System.out.println("\nAntorcha colocada.");
        System.out.println("Inventario actualizado: " + inventario);

        System.out.println("El jugador se ha quemado hasta morir.");
        inventario.clear();
        System.out.println("Inventario vacio: " + inventario);

        inventario.add("Bloque de Tierra");
        System.out.println("\nJugador ha obtenido " + inventario);
        inventario.remove("Bloque de Tierra");
        System.out.println("\nJugador ha tirado un objeto. \nInventario: " + inventario);

        if (inventario.size() < MAX_espacio) {
            inventario.add("Bloque de Tierra");
            System.out.println("Jugador ha recogido un objeto: " + inventario);
        }else{
            System.out.println("Inventario lleno.");
        }
    }
}
