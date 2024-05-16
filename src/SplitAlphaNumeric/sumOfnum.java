package SplitAlphaNumeric;

public class sumOfnum {

	public static void main(String[] args) {
		
		String str = "65dgd2gsjs3g34hdhd3";
		String temp ="0";
		int sum =0;
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else
			{
				sum =sum + Integer.parseInt(temp);
				temp="0";
			}
			
		}
		System.out.println(sum +Integer.parseInt(temp));

	}

}
