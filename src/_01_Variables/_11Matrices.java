package _01_Variables;

import java.util.Arrays;

public class _11Matrices {
    public static void main(String[] args) {
        //Arrays de dos dimensiones
        int[][] matrizNumeros = new int[3][4];
        for(int i=0; i < matrizNumeros.length; i++){
            System.out.println("fila -> " + i);
            for(int j=0; j< matrizNumeros[i].length; j++){
                matrizNumeros[i][j] = j*5*(i+1);
                System.out.println(matrizNumeros[i][j]);
            }
        }

        //Definición de una matriz con datos desde el inicio
        //Matriz irregular No todas las filas tienen las mismas columnas
        int[][] matrizNumeros2 = {{1,2,3,4},{1,2},{1,2,3},{1,2,3,4}};
        for(int[] fila : matrizNumeros2){
            System.out.println("Fila");
            for(int columna : fila){
                System.out.println("Contenido -> " + columna);
            }
        }

        System.out.println("Matriz " + Arrays.deepToString(matrizNumeros));
        System.out.println("Matriz " + Arrays.deepToString(matrizNumeros2));
    }
}
