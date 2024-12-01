package stringpackage;
//Count Occurrences of a Substring

public class SubstringCountOccurrences {

	public static int countOccurences(String s, String sub)
	{
		int index=0;
		int count=0;
		while((index = s.indexOf(sub,index)) != -1)
		{
			count++;
			index = index + sub.length();
		}
		return count;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello, World! World!";
		String sub = "World!";
		System.out.println(countOccurences(s, sub));
	}
}

//int count = 0;
//int index = 0;
//while((index = s.indexOf(sub, index)) != -1)
//{
//	count++;
//	System.out.println("Index of Sub : "+s.indexOf(sub, index));
//
//	System.out.println("Count : "+count);
//	System.out.println("Index : "+index);
//
//	index = index + sub.length();
//	System.out.println("Index 1 : "+index);
//	System.out.println("Sub length : "+sub.length());
//
//}
//return count;