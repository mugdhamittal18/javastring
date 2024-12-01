package stringpackage;

public class ReverseStringUsingCharArray {
	public static void main(String[] args) {

		String str = "Helponm";
		//char[] arr = new char[5];
		char[] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(ch.length);

		for(int i=0, j = ch.length - 1 ; i<j; i++ , j--)
			// i = 0, j=4 -> i = 1, j=3 -> 2 , 2 NA
		{
			char temp = ch[i];//Hel
			ch[i] = ch[j];    //0-o l 
			ch[j] = temp;	  //4-H e 
			System.out.println(i+":"+ch[i]+" "+j+":" +ch[j]);

		}
		
		String rev = new String(ch);
		System.out.println("Reversed String : "+rev);	
	}
}
