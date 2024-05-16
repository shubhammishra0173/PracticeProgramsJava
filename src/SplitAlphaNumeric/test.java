package SplitAlphaNumeric;

public class test {
	public static void main(String[] args) {
		
		String special= "";
		String num="";
		String letter ="";
		String str = "shubh@#$123";
		
		for(int i =0;i<str.length();i++)
		{
			
			char a =str.charAt(i);
			if(Character.isDigit(a))
			{ num =num+a;
				
			}
			else if(Character.isAlphabetic(a))
			{
				letter = letter +a;
			
			}
			else
			{
				special=special +a;
			}
		}
System.out.println(special);
System.out.println(letter);
System.out.println(num);
	}
}
