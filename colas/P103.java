
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Cliente {

    int id;
    int tiempoComprando; // Cuántos minutos le toma comprar

    public Cliente(int id, int tiempoComprando) {
        this.id = id;
        this.tiempoComprando = tiempoComprando;
    }
}

public class P103 {

    public static void main(String[] args) {
        Random random = new Random();

        Queue<Integer> carritosDisponibles = new LinkedList<>();
        for (int i = 1; i <= 25; i++) {
            carritosDisponibles.offer(i);
        }

        Queue<Cliente> filaEsperaCarritos = new LinkedList<>();
        Queue<Cliente> clientesComprando = new LinkedList<>();

        Queue<Cliente> caja1 = new LinkedList<>();
        Queue<Cliente> caja2 = new LinkedList<>();
        Queue<Cliente> caja3 = new LinkedList<>();

        int contadorClientes = 1;

        System.out.println("°_INICIO DE SIMULACION_°");

        for (int minuto = 1; minuto <= 15; minuto++) {
            System.out.println("\n--- MINUTO " + minuto + " ---");

            // Even 1: Llegan nuevos clientes al supermercado (entre 1 y 4 por minuto)
            int nuevosClientes = random.nextInt(4) + 1;
            for (int i = 0; i < nuevosClientes; i++) {
                // Cada cliente tarda entre 1 y 3 minutos en elegir sus cosas
                int tiempoDeCompra = random.nextInt(3) + 1;
                Cliente nuevo = new Cliente(contadorClientes++, tiempoDeCompra);
                filaEsperaCarritos.offer(nuevo);
                System.out.println("[***Llegada***] Cliente #" + nuevo.id + " entró a la fila por un carrito.");
            }
            // Evento 2: Asigna carritos a los que están esperando
            while (!filaEsperaCarritos.isEmpty() && !carritosDisponibles.isEmpty()) {
                Cliente clienteConSuerte = filaEsperaCarritos.poll(); // Sale de la fila de espera
                carritosDisponibles.poll(); // agarra un carrito de la cola
                clientesComprando.offer(clienteConSuerte); // Entra a comprar
                System.out.println("[Carrito asignado] Cliente #" + clienteConSuerte.id + " tomó un carrito y empezó a comprar.");

            }
            // Evento 3: Los clientes compran. Si terminan, van a la caja con MENOS gente
            int clientesEnPasillo = clientesComprando.size();
            for (int i = 0; i < clientesEnPasillo; i++) {
                Cliente c = clientesComprando.poll();
                c.tiempoComprando--; // Pasa un minuto de su compra

                if (c.tiempoComprando == 0) {
                    // Terminó de comprar, buscamos la caja más vacía comparando los tamaños (.size())
                    if (caja1.size() <= caja2.size() && caja1.size() <= caja3.size()) {
                        caja1.offer(c);
                        System.out.println("[A la Caja] Cliente #" + c.id + " fue a la Caja 1 (Fila actual: " + caja1.size() + ")");
                    } else if (caja2.size() <= caja1.size() && caja2.size() <= caja3.size()) {
                        caja2.offer(c);
                        System.out.println("[A la Caja] Cliente #" + c.id + " fue a la Caja 2 (Fila actual: " + caja2.size() + ")");
                    } else {
                        caja3.offer(c);
                        System.out.println("[A la Caja] Cliente #" + c.id + " fue a la Caja 3 (Fila actual: " + caja3.size() + ")");
                    }
                } else {
                    // Aún no termina, vuelve a la cola de compradores para el siguiente minuto
                    clientesComprando.offer(c);
                }
            }
        // Eventoo 4: Las cajas atienden al primer cliente de su fila y devuelven el carrito
        if (!caja1.isEmpty()) {
            Cliente atendido = caja1.poll();
            carritosDisponibles.offer(1); // El carrito vuelve a estar disponible en la cola
            System.out.println("[PAGÓ] Cliente #" + atendido.id + " pagó en Caja 1 y devolvió su carrito.");
        }
        if (!caja2.isEmpty()) {
            Cliente atendido = caja2.poll();
            carritosDisponibles.offer(1);
            System.out.println("[PAGÓ] Cliente #" + atendido.id + " pagó en Caja 2 y devolvió su carrito.");
        }
        if (!caja3.isEmpty()) {
            Cliente atendido = caja3.poll();
            carritosDisponibles.offer(1);
            System.out.println("[PAGÓ] Cliente #" + atendido.id + " pagó en Caja 3 y devolvió su carrito.");
        }

        // Reporte del estado actual:
        System.out.println(">> ESTADO: Carritos libres: " + carritosDisponibles.size()
                + " -- Clientes esperando carrito: " + filaEsperaCarritos.size());
        
    }
    System.out.println("\n°_FIN DE LA SIMULACIÓN_°");
}
}