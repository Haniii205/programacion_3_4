public class trabajo_clase1 {
    public static void main(String[] args) {
        //Forma 1, creacion de arreglo
        int[] a = {2,8,10,6,15,20,21,1,3,12};

        //Recorremos el arreglo
        for (int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]: " + a[i]);
        }

        //forma 2, llenando el arreglo de forma aleatoria
        int[] b = new int[10];
        int max = 100;
        int min = 1;
        
        for (int i = 0; i < b.length; i++){
            b[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("b[" + i + "]: " + b[i]);
        }
    }
}
