package _01_Variables;

public class JavaTypes{
	
	private int $int = 1_0_0_0;
	private byte $byte = 123;
	private long $long = 123;
	private short $short = 1000;
	private char $char = 'a';
	private float $float = 23.0f;
	private double $double = 234.0;
	private boolean $boolean = false;	
	private String $str1 = null;
		
	public static void main(String args[]){		
		System.out.println("---Variables de instancia");	
		JavaTypes obj1 = new JavaTypes();
		System.out.println(obj1.$int);
		System.out.println(obj1.$byte);
		System.out.println(obj1.$long);
		System.out.println(obj1.$short);
		System.out.println(obj1.$char);
		System.out.println(obj1.$float);
		System.out.println(obj1.$double);
		System.out.println(obj1.$boolean);
		System.out.println(obj1.$str1);
				
	}	
	
}