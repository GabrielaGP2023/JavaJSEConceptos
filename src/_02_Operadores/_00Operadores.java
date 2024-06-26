package _02_Operadores;

public class _00Operadores{
	
	public static void main(String args[]){
		
		//1. Operadores Unarios
		
			//incremento/decremento post pre
			int a = +10;		
			int b = -10;
			a++;		// a incrementa de 10 a 11
			++a;		// a incrementa de 11 a 12
			System.out.println(a); //12
			b++;		// b incrementa de -10 a -9
			System.out.println(b);
			
			--a; // a--
			System.out.println(a); // de 12 a 11
			
			//complemento lógico
			boolean expr1 = false;
			boolean expr2 = !expr1; 
			System.out.println("---- Complemento logico"); 
			System.out.println(expr2); //true
		
		//2. Cast
		System.out.println("---- Cast"); 
		int int1 = (int) 200.00;
		System.out.println("int: "+int1);
		
		//3. Operadores Aritméticos
		
			//Concatenacion String
			System.out.println("---- Concatenacion String"); 
			String str1 = "hello";
			String str2 = " world";
			String s = str1 + str2;			
			System.out.println(s);
			
		//4. Relacionales
		
			//==
			Integer i = 10;		
			Double d = 10.0;
			//double d2 = d;
			//System.out.println(i == d);	// referencias de distintos tipos
			
			System.out.println("equals:");
			//System.out.println(i == d2);
			
			Integer integera = 10;
			Integer integerb = 10;			
			System.out.println("----Integers");
			System.out.println(integera == integerb);
			
			//instanceof
			System.out.println("--- instanceof");
			Object obj = "hello";
			boolean isString = (obj instanceof String);
			System.out.println(isString);

			boolean isNumber = (obj instanceof Number);
			System.out.println(isNumber);		
		
	}
	
}