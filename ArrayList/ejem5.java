import java.util.ArrayList;
import java.util.List;

public class ejem5 {
    private static int MAX_capacidad = 3; 
    private static List<String> bolsaBotin = new ArrayList<>();
    
    public static void recolectarItem(String item){
        if (bolsaBotin.size()< MAX_capacidad) {
            bolsaBotin.add(item);
            System.out.println("Objeto añadido: " + item);
        }else{
            System.out.println("Bolsa llena, no puedes añadir " +  item + " a tu bolsa.");
        }
    }
    public static void main(String[] args) {
        System.out.println("---Bolsa nivel 1.---");

        System.out.println("\n[Explorando] Ajay recolecta suministros en Kyrat (que es una ciudad):");
        recolectarItem("Piel de oso tiberiano");
        recolectarItem("Libro antiguo");
        recolectarItem("Granadas");

        System.out.println("\n[Explorando] Ajay encuentra municion y la guarda.");
        recolectarItem("Balas de Rifle");

        System.out.println("\nHay nueva mejora para la bolsa");
        System.out.println("\nAjay usa la piel de Oso Tiberiano para mejorar la bolsa");

        int posiMaterial = bolsaBotin.indexOf("Piel de oso tiberiano");

        if (posiMaterial != -1){
            bolsaBotin.remove(posiMaterial);
            System.out.println("---> Piel de oso tiberiano usado del inventario.");
            MAX_capacidad = 6;
        System.out.println("Bolsa mejorada con: " + MAX_capacidad + " mas espacios.");
        System.out.println("Bolsa nivel 2 alcanzada.");
        }else{
            System.out.println("No tienes materiales necesarios para mejorar la bolsa.");
        }
        System.out.println("\n[Exploración] Ajay vuelve a intentar recoger la munición y más botín:");
        recolectarItem("Munición de Rifle");
        recolectarItem("Reloj Antiguo");
        recolectarItem("Planta Roja");

        System.out.println("\nBolsa de Botín: " + bolsaBotin);
        System.out.println("Espacios ocupados actualmente: " + bolsaBotin.size() + " de " + MAX_capacidad);
    }
}
