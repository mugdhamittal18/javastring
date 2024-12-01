package stringpackage;

public class SubstringExists {

	static boolean substring(String s, String substring)
	{
		return s.contains(substring);
	}
	public static int countOccurences(String s, String sub) {
		// TODO Auto-generated method stub
		int count = 0;
		int index = 0;
		while((index = s.indexOf(sub, index)) != -1)
		{
			count ++;
			System.out.println("Index of substring  : " +sub+" : "+index);//0
			index = index + sub.length();//0+5 = 5, 29+5= 34
			System.out.println("Index of substring  : " +sub+" : "+index);
			System.out.println("Count of substring  : " +sub+" : " +count);
		}		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("India is a secular country!, India, Secular, india!");
		String sub = new String("oun");
		String sub1 = new String("osun");

		System.out.println("S contains substring sub  : " +substring(s, sub));
		System.out.println("S contains substring sub1 : " +substring(s, sub1));
		
		String sub2 = new String("q");
		String sub3 = new String("India");
		String sub4 = new String("ry!, ");
		String sub5 = new String("india");

		System.out.println("Count occurences of substring sub2 : " +sub2+" : "+countOccurences(s, sub2));
		System.out.println("Count occurences of substring sub3 : " +sub3+" : "+countOccurences(s, sub3));
		System.out.println("Count occurences of substring sub4 : " +sub4+" : "+countOccurences(s, sub4));
		System.out.println("Count occurences of substring sub5 : " +sub5+" : "+countOccurences(s, sub5));

		System.out.println("Length of s  : " +s.length());
		System.out.println("Length of sub  : " +sub.length());

	}
	
}
