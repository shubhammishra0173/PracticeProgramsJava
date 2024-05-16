package StringPrograms;

public class subSt4 {

	
	static String checkSubString(String s)
	{
		int length = s.length();
		for(int i =0;i<s.length()/2;i++)
		{
			String substring =s.substring(0,i);
			StringBuilder sb =new StringBuilder();
			int count =length/i;
			for(int j=0;j<count;j++)
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
	public static void main(String[] args) {
		

	}

}
