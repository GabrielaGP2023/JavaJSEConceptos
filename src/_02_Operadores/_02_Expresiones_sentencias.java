package _02_Operadores;

public class _02_Expresiones_sentencias {

	public static void main(String args[]){
		int a = 10;
		int b = 20;
		//a + b;
		a = a + b;	// statement or expression?

		System.out.println(a = 25); //25
		
		int d = (a = a + b);	//sí compila
		System.out.println(d);	//30
		
		System.out.println(a = a + b); //30
		
	}
}