package repaso_colas;
public class pu1 {
    public static class cola{
        private int MAX=6;
        private String[]array;
        private int frente;
        private int fin;
        private int tam;

        public cola(){
            array = new String[MAX];
            frente=2;
            fin=4;
            array[2]="Mar";
            array[3]="Sella";
            array[4]="Centurión";
            tam=3;
        }
        public void añadir (String nombre){
            if (tam==MAX){
                System.out.println("No se puede añadir ´"+nombre+"´, la cola está llena.");
                return;
            }
            // Añadir el elemento al final de la cola
        fin=(fin+1)%MAX;
        array[fin]=nombre;
        tam++;
        imprimir("Se añadió: °-"+nombre);
    }
    public String eliminar(){
        if (tam==0){
            System.out.println("Nose puede eliminar, la cola anda vacia.");
            return null;
        }
        String eliminado=array[frente];
        array[frente]="||";
        frente=(frente+1)%MAX;
        tam--;
        imprimir("Se eliminó: °-"+eliminado);
        return eliminado;
    }
    public void eliminarTodo(){
    System.out.println("...Eliminando cada elemento...");
    while(tam>0){
        String eliminado =eliminar();
        System.out.println("Elemento eliminado: " + eliminado);
    }
    System.out.println("Cola vacia.");
}
public void imprimir(String operacion){
    //el %-10s es uhna cadena de caracteres de x espacio a la izquierda
    System.out.printf("%-10s-° en el |Array| = [", operacion);
    for (int i = 0; i < MAX; i++) {
        // Si el elemento es o está vacio: "null-||", se imprime un espacio en blanco
       String valor = (array[i] == null || array[i].equals("||")) ? " " : array[i];
       System.out.print(valor); 
       // Agregar una coma y un espacio después de cada elemento
       if (i < MAX - 1) System.out.print(", ");
    }
    System.out.print("]\n");
}
}
public static void main(String[] args) {
    
    cola c = new cola();
    System.out.println("=== ESTADO DE COLA ===");
    c.imprimir("Cola inicial: ");
    System.out.println("\n======================\n");
    c.añadir("Gloria");
    System.out.println();
    c.añadir("Generosa");
    System.out.println();
    c.eliminar();
    System.out.println();
    c.añadir("Positivo");
    System.out.println();
    c.añadir("Horche");
    System.out.println();
    c.eliminarTodo();
}
}