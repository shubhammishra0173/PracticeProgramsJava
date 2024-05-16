package StringPrograms;

public class subSt5 {

	
	static String checkSubstring(String s)
	{
		int length = s.length();
		for(int i =1;i<s.length()/2;i++)
		{
			StringBuilder sb = new StringBuilder();
			String subString = s.substring(0,i);
			int count =length/i;
			for(int j =0;j<count;j++)
			{
				sb.append(subString);
				if(sb.toString().equals(s))
				{
					return subString;
				}
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		String s = "abcabcabc";
		String subString = checkSubstring(s);
		int count=0;
		for(int i =0;i<subString.length();i++)
		{
			count++;
		}
System.out.println(count);
	}

}
