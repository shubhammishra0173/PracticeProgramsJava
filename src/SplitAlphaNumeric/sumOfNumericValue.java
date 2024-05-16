package SplitAlphaNumeric;

public class sumOfNumericValue {

	static int sumOfnumericValue(String str)
	{
		String temp ="0";
		int sum =0;
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				temp = temp +ch;
				
			}
			else
			{
				sum = sum +Integer.parseInt(temp);
				temp="0";
			}
			
		}
		return sum +Integer.parseInt(temp);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfnumericValue("1jd2h3j3jkj34hk4"));
		
	}

}
