package SplitAlphaNumeric;

public class split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "t1e2s3t4@1#t$t%";
		String digit="";
		String character= "";
		String SpecialChar="";
		for(int i=0;i<str.length();i++)
		{
			char a =str.charAt(i);
			if(Character.isDigit(a))
			{
				digit = digit+a;
			}
			else if(Character.isAlphabetic(a))
			{
				character= character+a;
			}
			else
			{
				SpecialChar=SpecialChar+a;
			}
		}
		System.out.println(digit);
		System.out.println(character);
		System.out.println(SpecialChar);
	}

}
