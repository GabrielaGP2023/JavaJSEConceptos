package _02_Operadores;

public class _04OperadoresLogicos {
    public static void main(String[] args) {

        int edad = 19;
        boolean esMiembro = true;

        // Verificar si es elegible para el descuento usando el operador ternario
        String mensaje = (edad >= 18 && esMiembro) ? "Eres elegible para el descuento." : "No eres elegible para el descuento.";


        int numero = 7;

        // Verificar si el número es positivo o múltiplo de 10
        if (numero > 0 || numero % 10 == 0) {
            System.out.println("El número es positivo o es múltiplo de 10.");
        } else {
            System.out.println("El número no es positivo y no es múltiplo de 10.");
        }
    }
}
