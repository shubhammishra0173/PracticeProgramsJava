package SplitAlphaNumeric;

public class count {
	public static void main(String [] args)
	{
	String str = "“I will eat 2 burgers 23 fries & 1.25 cokes l8 r”";
	String number = "";
	String letter ="";
	String Specialchar = "";
	for(int i =0 ;i<str.length();i++)
	{
	char a = str.charAt(i);
	if(Character.isDigit(a))
	{
	number = number + a;

	}
	else {
	letter= letter+a;
	}
	}
	System.out.println(number.length());
	System.out.println(letter.length());
	}
	
	}

