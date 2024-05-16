package StringPrograms;

public class accum5 {

	static String accum(String str)
	{
		StringBuilder result = new StringBuilder();
		for(int i =0;i<str.length();i++)
		{
			char c= str.charAt(i);
			result.append(Character.toUpperCase(c));
			for(int j =0;j<i;j++)
			{
				result.append(Character.toLowerCase(c));
			}
			if(i!=str.length()-1)
			{
				result.append("-");
			}
		}
		return result.toString();

	}
	
	public static void main(String[] args) {
		System.out.println(accum("saqwe"));  
		
	}

}
