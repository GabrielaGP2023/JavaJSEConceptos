package _03ClaseString;

public class _01Metodos {

    public static void main(String[] args) {
        String frase = "Este es un ejemplo de texto", palabra="casa" , palabra2="Casa";

        System.out.println("Numero de letras de la frase : "+frase.length());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("La posición en donde comienza la palabra ejemplo :"+ frase.indexOf("ejemplo"));
        System.out.println("La posición en donde comienza la o (derecha a izquierda):"
                + frase.lastIndexOf("o"));
        System.out.println(frase.equals(palabra));
        System.out.println(palabra.equalsIgnoreCase(palabra2));
        System.out.println("hola");

    }
}
