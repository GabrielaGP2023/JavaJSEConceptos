package _03ClaseString;

public class _02Metodos {

	public static void main(String args[]){
		
		//IndexOf
		System.out.println("ABCDEFG".indexOf('C',0)); //2
		System.out.println("ABCDEFG".indexOf('D',0)); //3
		System.out.println("ABCDEFGA".indexOf('A',2)); //7

		System.out.println("hello".substring(2)); // "llo"
		//System.out.println("world".substring(6)); // 

		//replace
		System.out.println("aabbccdd".replace("bb","22")); //
		System.out.println("abcdabcdd".replace("d","e")); //

		// strip and trim
		System.out.println(" 1 2 3 ".strip()); //1 2 3
		System.out.println(" 1 2 3 ".trim()); //1 2 3

		//Concat y Uppercase
		System.out.println("hello".concat(" world"));
		System.out.println("lima".toUpperCase());
	}

}





