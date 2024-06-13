package _01_Variables;

import java.util.Random;

public class _10Random {
    public static void main(String[] args) {
        Random numAleatorio = new Random(); //Genera un número aleatorio
        int num = numAleatorio.nextInt(101);
        System.out.println(num);
    }
}
