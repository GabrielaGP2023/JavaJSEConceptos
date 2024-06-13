package _05EstructurasControl;

public class _04Bucles {

    public static void main(String[] args) {
        //FOR EACH -> Colecciones
        //Arrays
        int[] notas = {8,9,7,9,10};
        for(int elemento: notas){
            System.out.println(elemento);
        }

        String[] palabras ={"buenos días","buenas tardes", "buenas noches"};
        for(String elemento : palabras){
            System.out.println(elemento);
        }
    }
}
