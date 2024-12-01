package stringpackage;
public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		String str = new String("Hello!");
		System.out.println("String length = "+str.length());

		String reversed = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed = reversed + str.charAt(i);
		}

		System.out.println(reversed);
		
	}

}
