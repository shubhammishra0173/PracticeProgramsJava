package ReverseString;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str =  "shubham mishra";
		char[]ch = str.toCharArray();
		String reverse ="";
		for(int i =str.length()-1;i>=0;i--)
		{
			reverse = reverse +ch[i];
		}
		System.out.println(reverse);
	}

}
