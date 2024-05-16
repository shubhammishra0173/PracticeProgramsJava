package StringPrograms;

public class subString3 {

	public static void main(String[] args) {
		
		String s1 ="abab";
		String repeatedString = findRepeatedString(s1);
		if(repeatedString!=null)
		{
			   System.out.println("The repeated string is: " + repeatedString);
	      } else {
	          System.out.println("No repeated string found.");
		}

	}
	static String findRepeatedString(String s)
	{
		int length =s.length();
		for(int i =1;i<length/2;i++)
		{
		String substring =s.substring(0,i);
		int repeatcount=length/i;
		StringBuilder sb =new StringBuilder();
		for(int j =0;j<repeatcount;j++)
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
