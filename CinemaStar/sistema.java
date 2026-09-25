
import java.util.Scanner;

public class sistema {
    public void menuPrincipal() {
        Scanner tc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n=== BIENVENIDO A CINEMASTAR ===");
            System.out.println("1. Salas");
            System.out.println("2. Peliculas");
            System.out.println("3. Salir");
            System.out.print("Elige: ");
            opcion = tc.nextInt();
            tc.nextLine();
}
    switch (opcion){
        case 1:
            sala.mostrarSala();
    }
    }
}