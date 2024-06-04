package _01_Variables;

public class _02_Asignaciones {

	public static void main(String arg[]){
		//Ensanchamiento
		byte b1= 10; char c1; int i1 = 20; long l1= 30;double d1;
		d1 = l1; // long -> double
		l1 = i1; // int -> long
		i1 = b1; // byte -> int
		System.out.println(d1+" "+l1+" "+i1);

		//Estrechamiento implicito
		final char c2= 10; final int a2 = 20; 
		b1 = c2; // char -> byte
		c1 = a2; // int -> char
		System.out.println(b1+" "+c1);

		// Estrechamiento explícito
		byte b3= 10; int a3 = 200; long l3= 30L; double d3 = 40.00;	
		b3 = (byte) a3;	// int -> byte
		a3 = (int) l3; // long -> int
		l3 = (long) d3; //double -> long
		System.out.println(b3+" "+a3+" "+l3);




	}

}