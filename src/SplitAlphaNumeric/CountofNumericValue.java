package SplitAlphaNumeric;

public class CountofNumericValue {

	public static void main(String[] args) {
		String str = "asjasg23jksfh45";
		int sum=0;
		String temp="0";
		for(int i =0;i<str.length();i++)
	{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else
			{
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
	}
		System.out.println(sum+Integer.parseInt(temp));

	}

}
