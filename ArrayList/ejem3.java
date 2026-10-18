
import java.util.ArrayList;
import java.util.List;

class Zombie {

    String nombre;
    int vida;
    String dropAlmorir;

    public Zombie(String nombre, int vida, String dropAlmorir) {
        this.nombre = nombre;
        this.vida = vida;
        this.dropAlmorir = dropAlmorir;
    }
}

public class ejem3 {

    private static final int MAX_espacio = 36;
    private static List<Zombie> Enemigos = new ArrayList<>();
    private static List<String> items = new ArrayList<>();
    private static List<String> inventarioJugador = new ArrayList<>();

    public static void recogerObjeto(String objetoNuevo) {
        if (inventarioJugador.size() < MAX_espacio) {
            inventarioJugador.add(objetoNuevo);
            System.out.println("---> Objeto añadido: " + objetoNuevo);
        } else {
            System.out.println("---> [INVENTARIO LLENO]: El jugador no tiene espacio para guardar: " + objetoNuevo);
        }
    }

    public static void main(String[] args) {

        Enemigos.add(new Zombie("Zombie", 40, "Carne Podrida"));
        Enemigos.add(new Zombie("Zombie_aldeano", 35, "Zanahorias"));

        System.out.println("---Empieza el simulador---");
        System.out.println("Generando zombies: " + Enemigos.size() + " Zombies en la zona.");

        System.out.println("\nJugador está atacando al moustruo.");

        for (Zombie z : Enemigos) {
            if (z.nombre.equals("Zombie")) {
                z.vida = 0;
                System.out.println("\n----> " + z.nombre + " ha sido derrotado. \nVida restante: " + z.vida);

                System.out.println(z.nombre + " ha dejado caer un objeto: " + z.dropAlmorir);
                items.add(z.dropAlmorir);
            }
        }
        boolean alguienMurio = Enemigos.removeIf(zombie -> zombie.vida <= 0);
        if (alguienMurio) {
            System.out.println("Moustruo removido.");
            System.out.println("\nZombies restantes: " + Enemigos.size());
        }

        System.out.println("Item flotando en el suelo: " + items);

        if (!items.isEmpty()) {
            System.out.println("Jugador camina cerca del objeto y lo agarra.");

            for (String item : items) {
                recogerObjeto(item); 
            }
            items.clear(); 
        }
        System.out.println("Inventario del jugador:" + inventarioJugador);
        System.out.println("Items en el suelo: " + items);
    }
}
