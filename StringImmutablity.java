package stringpackage;

public class StringImmutablity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String object
		String originalString = "Hello ";
		
		//Attempt to modify the String 
		String modifiedString = originalString.concat("World !");
		System.out.println("Modified String : "+modifiedString);
		
		//Original String remains unchanged after Modifying String 
		System.out.println("Original String after Modifying String : "+originalString);
		
		String s = "Mugdha";
		System.out.println("Original s : "+s);
		String modified_s = s.concat(" "+originalString);
		System.out.println("Modified s : "+modified_s);
		System.out.println("Original s : "+s);

		String s1 = new String("London");
		String s2 = new String("London");
		System.out.println("s1 value is equal to s2 : " +s1.equals(s2));
		System.out.println("Ref value s1 == s2 : "+ (s1==s2));

		String a1 = "London1";
		String a2 = "London1";
		System.out.println("a1 value is equal to a2 : " +a1.equals(a2));
		System.out.println("Ref value a1 == a2 : "+ (a1==a2));
		System.out.println(a1+" a1 - Char at index 0 : "+a1.charAt(0));
		//System.out.println(a1+" a1 - Char at index 7 : "+a1.charAt(7));// java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		System.out.println(a1+" a1 - Char at index 6 : "+a1.charAt(6));
		System.out.println("a1 compare to a2 : "+a1.compareTo(a2));
		System.out.println("a1 compare to s1 : "+a1.compareTo(s1));

		//System.out.println("  "+);
		String b1 = "London1 kjkjl";
		String b2 = "LONDON1";
		String b3 = "nlLondon1 bn";
		System.out.println("b1 compare to ignore case b2 : "+b1.compareToIgnoreCase(b2));
		System.out.println("b1 compare to ignore case b3 : "+b1.compareToIgnoreCase(b3));
		System.out.println("b1 value of char 'd' : "+b1.valueOf('d'));

		StringBuffer c1 = new StringBuffer("London1 1000");
		StringBuffer c2 = new StringBuffer("LoNdon1 0190 Q1 ");
		StringBuffer c3 = new StringBuffer("nlLondon1 bn");
		System.out.println("c1 compare to ignore case c2 : "+c1.compareTo(c2));
		//System.out.println("c1 compare to ignore case c3 : "+c1.compareToIgnoreCase(c3));
		//System.out.println("b1 value of char 'c' : "+c1.valueOf('d'));
		
		System.out.println("c2 capacity : "+c2.capacity());
		System.out.println("c2 append c1 :  "+c2.append(c1));

		
		
		
	}
}
