package StringPrograms;

public class subString7 {

	static String findRepeatedString(String s) 
	{
		int length =s.length();
		for(int i =1;i<=length/2;i++)
		{
			String substring =s.substring(0,i);
			int count =length/i;
			StringBuilder sb =new StringBuilder();
			for(int j =0;j<count;j++)
			{
				sb.append(substring);
			}
			if(sb.toString().equals(s))
			{
				return sb.toString();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
	
		String substring =findRepeatedString("abab");
		if(substring!=null)
		{
			System.out.println(substring);
		}
		else
		{
			System.out.println("String is unique");
		}

	}

}
