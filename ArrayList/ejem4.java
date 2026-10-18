
import java.util.ArrayList;
import java.util.List;

public class ejem4 {

    public static void main(String[] args) {
        List<String> bolsaBotin = new ArrayList<>();
        int capacidadMaxima = 10;

        System.out.println("---Bolsa---");

        bolsaBotin.add("Piel de Tapir");
        bolsaBotin.add("Planta Verde");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        bolsaBotin.add("Rupias");
        
        System.out.println("Contenido de la bolsa: " + bolsaBotin);

        System.out.println("\nEspacios utilizaods: " + bolsaBotin.size() + " de " + capacidadMaxima);
        if (bolsaBotin.contains("Piel de Tapir")) {
            System.out.println("! Tienes los materiales necesarios para fabricar una mejora de la bolsa.");
        }

        System.out.println("\nAjay encuentra una Planta Azul en el camino e intenta recogerla.");
        if (bolsaBotin.size() < capacidadMaxima) {
            bolsaBotin.add("Planta Azul");
            System.out.println("---> Objeto recogido.");
        } else {
            System.out.println("---> Bolsa de botín llena.");
        }
        System.out.println("Mochila actualizada: " + bolsaBotin);

        System.out.println("\nAjay registra un enemigo e intenta meter un objeto a su bolsa.");
        if (bolsaBotin.size() < capacidadMaxima) {
            bolsaBotin.add("Reloj Antiguo");
        } else {
            System.out.println("---> Bolsa de botín llena.");
        }

        if (bolsaBotin.size() >= 1) {
            String primerObjeto = bolsaBotin.get(0);
            System.out.println("\n[Menú] Inspeccionando objeto principal: " + primerObjeto);
        }
    }
}
