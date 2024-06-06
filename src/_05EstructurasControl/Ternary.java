package _05EstructurasControl;

public class Ternary{

	public static void main(String args[]){
		//--- Operandos numéricos
		
		//primitivos numericos (amplitud)
		int a = 1, b=2;
		double double1 = a == b? 5: 10.0; //int, double
		var int0 = a == b? 5: 10.0;  // var infiere double
		
		//primitivo numericos y wrapper
		int intPrim1 = 6; double doubPrim1 = 60.0;
		double double2 = 10.0, double3;
		byte byte1=1, byte2;
		Integer integer1 = 1000;
		
		//primitivo y wrapper
		a = false?intPrim1:byte1; //int:Byte ==> int
		integer1 = false?intPrim1:byte1; 
		//int:Byte ==> Integer
		
		double2 = false?intPrim1:doubPrim1; //int, double ==> Double
		
		//wraper y wraper
		int integer2 = false?integer1:byte1; //Integer, Byte ==> Integer
		
		//Double double4 = false?integer1:byte1;		
		double double5 = false?integer1:byte1;
		
		
		//Asociación derecha
		int a2 = true?false?0:1:2;
		System.out.println(a2);
		
		int a1 = true?(false?0:1):2;
		System.out.println(a1);
			
	}
}