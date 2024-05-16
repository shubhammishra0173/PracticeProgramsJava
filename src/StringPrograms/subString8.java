package StringPrograms;

public class subString8 {

	
	static String subStringcheck(String s)
	{
		int length=s.length();
		
		for(int i =1;i<=s.length()/2;i++)
		{
			String substring=s.substring(0,i);
			int count =length/i;
			StringBuilder sb =new StringBuilder();
			for(int j=0;j<count;j++)
			{
				sb.append(substring);
				
				if(sb.toString().equals(s))
				{return substring;
					
				}
			}
			
		}
		return null;
	
		
	}
	
	public static void main(String[] args) {
		String s="abcabcabc";
		String substring=subStringcheck(s);
		int num =0;
		if(substring!=null)
		{
			
			for(int i =0;i<substring.length();i++)
			{
				num++;
			}
			
		}
		System.out.println("Total Repeation of String is "+num);

	}

}
