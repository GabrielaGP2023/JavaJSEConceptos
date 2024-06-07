package _05EstructurasControl;

public class _03Bucles {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){
            System.out.println("Hola mundo " + i);
        }
        for(int i = 10; i >=1; i--){
            System.out.println( i);
        }
        for(int i = 10; i >=0; i--){
            System.out.println(i);
        }
        //Ejemplo while
        System.out.println("---While ---");
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        i=1;
        //Ejemplo Do while
        System.out.println("--Do while--");
        do{
            System.out.println(i++);
        }while(i<=10);
    }
}
