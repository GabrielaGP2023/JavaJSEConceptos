package _02_Operadores;

public class _05Ternary {

	public static void main(String args[]){
		//--- Operandos numéricos
		
		//primitivos numericos (amplitud)
		int a = 1, b=2;
		double double1 = a == b? 5: 10.0; //int, double
		var int0 = a == b? 5: 10.0;  // var infiere double
		

		//Asociación derecha
		int a2 = true?false?0:1:2;
		System.out.println(a2);
		
		int a1 = true?(false?0:1):2;
		System.out.println(a1);
			
	}
}