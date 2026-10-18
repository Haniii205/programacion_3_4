
import java.util.ArrayList;
import java.util.List;

class SoldadoGuardiaReal {

    String tipo;
    int salud;
    String botin;

    public SoldadoGuardiaReal(String tipo, int salud, String botin) {
        this.tipo = tipo;
        this.salud = salud;
        this.botin = botin;
    }
}

public class ejem6 {

    private static final int MAX_capacidad = 6;
    private static List<SoldadoGuardiaReal> soldadoEnemigo = new ArrayList<>();
    private static List<String> botinSuelo = new ArrayList<>();
    private static List<String> bolsaBotin = new ArrayList<>();

    public static void recolectarItem(String itemNuevo) {
        if (bolsaBotin.size() < MAX_capacidad) {
            bolsaBotin.add(itemNuevo);
            System.out.println("---> Guardado en la bolsa: " + itemNuevo);
        } else {
            System.out.println("---> [BOLSA LLENA] no hay espacio para " + itemNuevo);
        }
    }

    public static void main(String[] args) {
        soldadoEnemigo.add(new SoldadoGuardiaReal("Recluta con Fusil", 30, "Rupias"));
        soldadoEnemigo.add(new SoldadoGuardiaReal("Soldado Pesado", 100, "Cargador Ampliado"));
        soldadoEnemigo.add(new SoldadoGuardiaReal("Cazador con Arco", 45, "Flechas"));
        System.out.println("Soldados atacando: " + soldadoEnemigo.size());

        System.out.println("\n[Combate] Ajay detona un C4 en medio de los soldados.");

        for (SoldadoGuardiaReal soldado : soldadoEnemigo) {
            if (soldado.tipo.equals("Recluta con Fusil") || soldado.tipo.equals("Cazador con Arco")) {
                soldado.salud = 0;
                System.out.println("---> " + soldado.tipo + " eliminado. Su salud: " + soldado.salud);
                System.out.println("   Soltó botín en el suelo: " + soldado.botin);
                botinSuelo.add(soldado.botin);
            }
        }
      System.out.println("\nEnemigos caidos.");
        
        // removeIf() remueve del ArrayList en una sola pasada usando expresiones lambda
        boolean bajasConfirmadas = soldadoEnemigo.removeIf(soldado -> soldado.salud <= 0);

        if (bajasConfirmadas) {
            System.out.println("---> Enemigos eliminados. ");
            System.out.println("Enemigos sobrevivientes: " + soldadoEnemigo.size());
        }

        System.out.println("\n[Explorando] Objetos encontrados en los soldados: " + botinSuelo);
        if (!botinSuelo.isEmpty()) {
            System.out.println("Ajay se acerca a registrar los cuerpos:");
            
            for (String item : botinSuelo) {
                recolectarItem(item);
            }
            botinSuelo.clear();
        }
        System.out.println("\nBolsa: " + bolsaBotin);
        System.out.println("Estado de objetos tirados en el mapa: " + botinSuelo);
    }
}
