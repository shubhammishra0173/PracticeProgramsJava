package StringPrograms;

public class subStr {

	public static void main(String[] args) {

		String s1="abcabc";
		String subString =findRepeatedString(s1);

		if(subString!=null)
		{
			System.out.println("The subString repeated count is "+subString);
		}
		else
		{
			System.out.println("String is not repeateable");
		}
	

	}
	static String findRepeatedString(String s)
	{
		int length =s.length();
		for(int i =1;i<=s.length()/2;i++)
		{
			String substring = s.substring(0,i);
			int count=length/i;
			StringBuilder sb =new StringBuilder();
			for(int j =0;j<count;j++)
			{
				sb.append(substring);
				if(sb.toString().equals(s))
				{
					return substring;
				}
			}
			
		}
		return null;
	}
}
