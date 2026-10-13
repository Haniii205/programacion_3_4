import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();

        historial.push("(Michael Jackson)");
        historial.push("(Darviin)");
        historial.push("(J Balvin)");
        System.out.println("Historial guardado: " + historial);

         System.out.println("La última que escuchaste fue: " + historial.peek());

        String regresar = historial.pop();
        System.out.println("Se presionó el botón atrás. \nRegresando a: " + regresar);
        System.out.println("Historial ahora: " + historial);
        System.out.println("¿El historial está vacío?: " + historial.empty());
    }
}
