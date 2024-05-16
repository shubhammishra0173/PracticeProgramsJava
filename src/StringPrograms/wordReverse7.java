package StringPrograms;

public class wordReverse7 {

	public static void main(String[] args) {
		
		String str = "This is my book";
		String []split =str.split(" ");
		String reverseString ="";
		for(int i =0;i<split.length;i++)
		{
			String word= split[i];
			String reverseword="";
			for(int j =word.length()-1;j>=0;j--)
			{ char ch = word.charAt(j);
				reverseword =reverseword + ch;
			}
			reverseString =   reverseString +reverseword+" ";
		}
		System.out.println(reverseString);

	}

}
