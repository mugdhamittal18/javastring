package stringpackage;

public class ReverseString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.reverse().toString());
		
		StringBuilder sbl = new StringBuilder("World");
		System.out.println(sbl.reverse().toString());
		
		String s = new String("Culture");
		StringBuffer sbf = new StringBuffer(s);
		System.out.println(sbf.reverse().toString());

		String str = "Program";
		StringBuffer sbf1 = new StringBuffer(str);
		System.out.println(sbf1.reverse().toString());
	}
}
/*    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}*/
	

