
//Escribir un método para determinar si una secuencia de caracteres de entrada es de
//la forma:
//X & Y

import java.util.Stack;
public class p92 {

    //Letra o Ampersand: es &
    public static boolean secuenciaValida(String s) {
        Stack<Character> pila = new Stack<>();
        boolean letraEncontrada = false;
        boolean hayAlgoDespues = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '&') {
                if (letraEncontrada) { //si ya se encontró la letra & y hay otra & mas
                    return false;
                }
                if (pila.isEmpty()) {
                    return false;
                }
                letraEncontrada = true;
            } else {
                if (!letraEncontrada) { //parte de X, es &? no, tons agrega caracter
                    pila.push(c);
                } else {
                    hayAlgoDespues = true; // letra & encontrada, parte de Y
                }
            }
        }
        return letraEncontrada && hayAlgoDespues;
    }
    public static void main(String[] args) {
        System.out.println(secuenciaValida("xyz&xyz"));
        System.out.println(secuenciaValida("xyzxy&z"));
        System.out.println(secuenciaValida("&xyzxyz"));
        System.out.println(secuenciaValida("xy"));
        System.out.println(secuenciaValida("x&yz&xyz"));
        System.out.println(secuenciaValida("xyzxyz&"));
    }
}
