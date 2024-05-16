package StringPrograms;

public class subString6 {

	public static void main(String[] args) {
		String s1= "abcabcabc";
		String s = findRepeatedString(s1);
		if(s!=null)
		{
			System.out.println("Substring of String is "+s);
		}
		else
		{
			System.out.println("String is unique");
		}
		
	}
	static String findRepeatedString(String s)
	{ 
		int length =s.length();
		for(int i =1;i<=length/2;i++)
		{
		String substring = 	s.substring(0,i);
		int count =length/i;
		StringBuilder sb =new StringBuilder();
		int value =0;
		for(int j =0;j<count;j++)
		{
		sb.append(substring);	
		}
		
		if(sb.toString().equals(s))
		{
		System.out.println(value);
			return substring;
			
			
		}
		}
		
		return null;
	}

}
