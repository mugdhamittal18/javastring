package stringpackage;

public class StringBuilderConcatenation {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);

		sb.append(" World ");
		System.out.println(sb);
		
		for(int i=0; i<=10; i++)
		{
			sb.append(i);
		}
		System.out.println(sb.toString());
		
		String s1 = new String("California");
		String s2 = new String("California");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s3 = "California";
		String s4 = "California";
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		//Use String.format() for building strings with dynamic content.
		String name = "Rohan";
		int age = 5;
		String f = String.format("Name : %s, Age : %d",name ,age);
		System.out.println(f);
		
	}
}
