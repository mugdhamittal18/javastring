package stringpackage;
import org.junit.Assert;  

public class StringManipulation {
	
	public static void main(String[] args)
	{
		String s1 = "Hello !";
		s1 = s1+ " World!";
		System.out.println(s1);
		s1.concat("India ");
		System.out.println(s1); 
		String s2 = s1.concat("India ");
		System.out.println(s2); 
		System.out.println(s1); 

		String s3 = "abcdefghijklmnopqrstuvwxyz0123456789";
		System.out.println(s3.charAt(2)); //starts from 0 = c
		
		System.out.println(s3.concat(" "+s1)); 
		
		String s4 = "HeLLo !";
		System.out.println(s4.equalsIgnoreCase(s1)); 
		System.out.println("ABC".equalsIgnoreCase("abc"));// true
		
		System.out.println(s3.length()); 
		System.out.println("Hello !".length()); 
		
		System.out.println("Hello World!, Hello".replace('H', 'C')); 
		System.out.println("Hello World!, Hello".replace('O', 'C')); 
		System.out.println("Hello World!, Hello".replace("ll", "mm")); 

		System.out.println(s3.substring(2,6)); 
		System.out.println(s3.substring(3)); 

		System.out.println("abcdefgh".substring(3)); 
		System.out.println("abcdefgh".toUpperCase()); 
		System.out.println("ABCDEF176".toLowerCase()); 
		System.out.println(" abcdefgh".toString()); 
		System.out.println("   123abcdefgh123  ".trim()); 
		
	}

}
