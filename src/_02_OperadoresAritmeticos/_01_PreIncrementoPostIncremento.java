package _02_OperadoresAritmeticos;

public class _01_PreIncrementoPostIncremento {

    public static void main(String[] args) {
        int contador=1, contador2;

        contador = contador +1;
        System.out.println("Valor del contador :  "+ contador);

        contador++;
        System.out.println("Valor del contador :  "+ contador);
        ++contador;
        System.out.println("Valor del contador :  "+ contador);

        contador2 = contador++;
        System.out.println("Valor del contador :  "+ contador);
        System.out.println("Valor del contador 2 -- postincremento:  "+ contador2);
        contador = 4;
        contador2 = ++contador;
        System.out.println("Valor del contador :  "+ contador);
        System.out.println("Valor del contador :  2 -- preincremento "+ contador2);

        contador = 4;
        System.out.println("Preincremento " + (8 + ++contador));
        contador = 4;
        System.out.println("Preincremento " + (8 + contador++));
        System.out.println("Valor final de contador  -> " + contador);

        contador = contador + 2; //expresión larga
        System.out.println("Valor del contador :  "+ contador);
        contador = 5;
        contador += 2; //expresión reducida
        System.out.println("Valor del contador :  "+ contador);

        contador = +2;
        System.out.println("Valor del contador :  "+ contador);

        byte numerobyete = -23;



    }
}
