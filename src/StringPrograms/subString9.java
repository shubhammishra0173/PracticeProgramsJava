package StringPrograms;

public class subString9 {

	
	static String checkSubString(String s)
	{
		int length = s.length();
		for(int i =1;i<=s.length()/2;i++)
		{
			String substring = s.substring(0,i);
			int count=length/2;
			StringBuilder result= new StringBuilder();
			
			for(int j =0;j<count;j++)
			{
				result.append(substring);
				if(result.toString().equals(s))
				{
					return substring;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		String s = "ababab";
		String substring = checkSubString(s);
		int num =0;
		for(int i =0;i<=substring.length();i++)
		{
			num++;
		}
System.out.println(num);
	}

}
