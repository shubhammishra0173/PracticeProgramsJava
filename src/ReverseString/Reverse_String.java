package ReverseString;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Shubham Mishra";
		String reversestring ="";
		char[] ch = str.toCharArray();
		for(int i =str.length()-1;i>=0;i--)
		{
			reversestring = reversestring+ch[i];
		}
		System.out.println(reversestring);
	}

}
