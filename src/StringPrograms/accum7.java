package StringPrograms;

public class accum7 {

	static String accum(String str)
	{
		StringBuilder result =new StringBuilder();
		for(int i =0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			result.append(Character.toUpperCase(ch));
			for(int j =0;j<i;j++)
			{
				result.append(Character.toLowerCase(ch));
			}
			if(str.length()!=0)
			{
				result.append("-");
			}
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(accum("sgdshaj"));

	}

}
