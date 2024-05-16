package StringPrograms;

public class subStringCheck2 {

	public static void main(String[] args) {
		String s1 = "abab";
	      
	      String repeatedString = checkRepeatedString(s1);
	      
	      if (repeatedString != null) {
	          System.out.println("The repeated string is: " + repeatedString);
	      } else {
	          System.out.println("No repeated string found.");
	      }
	  }

	
	private static String checkRepeatedString(String s)
	{
		int length =s.length();
		for(int i =1;i<=length/2;i++)
		{
			String substring = s.substring(0,i);
			int repeatecount=length/i;
			StringBuilder sb=new StringBuilder();
			
			for(int j =0;j<repeatecount;j++)
			{
				sb.append(substring);
			}
			if(sb.toString().equals(s))
			{
				return substring;
			}
		}
		 return null;
	}

}
