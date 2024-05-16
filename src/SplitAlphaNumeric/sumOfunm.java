package SplitAlphaNumeric;

public class sumOfunm {

	public static void main(String[] args) {
	
		String str = "dhgs3sdgh4hgds21ghdsa3";
		int sum =0;
		String temp ="0";
		for(int i =0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(Character.isDigit(ch))
			{
				temp =temp+ch;
			}
			else
			{
				sum =sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp));

	}

}
