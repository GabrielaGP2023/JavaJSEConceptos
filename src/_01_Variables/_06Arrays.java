package _01_Variables;

import java.util.Scanner;

public class _06Arrays {
    public static void main(String[] args) {
        //Longitud de los arrays siempre la misma
        //Los arrays siempre deben tener el mismo tipo en todas sus celdas
        int[] numeros = new int[3];
        int[] numeros2 = {8,9,10}; //Para inicializar los datos del array
//        numeros[0]= 8;
//        numeros[1]= 9;
//        numeros[2]= 10;
        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<4;i++){
//            System.out.println("Escriba la nota del trimestre " + i );
//            numeros[i]=scanner.nextInt();
//        }
        for(int i=0; i<numeros2.length;i++){
            System.out.println("Nota del trimestre " + (i+1) + "->" + numeros2[i]);
        }
        //Obtener el número más pequeño del array

        scanner.close();






    }
}
