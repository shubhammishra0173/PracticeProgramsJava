package ReverseString;

public class test1 {

	public static void main(String[] args) {
		
		String str = "mishra";
		char[] ch =str.toCharArray();
		String reverseString = "";
		for(int i =str.length()-1;i>=0;i--)
		{
			reverseString=reverseString+ch[i];
			
		}
System.out.println(reverseString);
	}

}
