
import java.util.LinkedList;
import java.util.Queue;

public class cola {

    public static void main(String[] args) {

        Queue<String> colaMúsica = new LinkedList<>();

        colaMúsica.offer("(Laufey)");
        colaMúsica.offer("(Mon Laferte)");
        colaMúsica.offer("(Milo J)");
        System.out.println("Proxima cancion:" + colaMúsica);

        System.out.println("La siguiente en sonar será: " + colaMúsica.peek());

        String sonando = colaMúsica.poll();
        System.out.println("---| Sonando ahora: " + sonando);
        System.out.println("Quedan en espera: " + colaMúsica);
        System.out.println("¿La lista de espera está vacía?: " + colaMúsica.isEmpty());
    }
}
