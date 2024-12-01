package stringpackage;

public class Palindrome {
	
	static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		while(left<right)
		{
			if(s.charAt(left) != s.charAt(right))
				return false;
			left ++;
			right --;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "mmadamm";
		System.out.println("String is palindrome : "+isPalindrome(s));
	}
}