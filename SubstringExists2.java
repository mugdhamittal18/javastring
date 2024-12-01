package stringpackage;

public class SubstringExists2 {	
	
	public static void main(String[] args) {

		String s = new String("India is a secular country!, India, Secular, india!");
		String sub = new String("oun");
		//String sub1 = new String("osun");
		System.out.println(isSubstring(s,sub));
	}

	private static boolean isSubstring(String s, String sub) 
	{
		return s.contains(sub);
	}
	
}
