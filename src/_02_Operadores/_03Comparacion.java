package _02_Operadores;

public class _03Comparacion {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = new String("Hola");

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1 == str3: " + (str1 == str3));
    }
}
