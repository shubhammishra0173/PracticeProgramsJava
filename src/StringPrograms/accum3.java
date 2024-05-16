package StringPrograms;

public class accum3 {

	static String accum(String s)
	{
		StringBuilder result = new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			char c = s.charAt(i);
			result.append(Character.toUpperCase(c));
			for(int j =0;j<i;j++)
			{
				result.append(Character.toLowerCase(c));
			}
			if(i!=s.length())
			{
				result.append("-");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		
System.out.println(accum("shubh"));
	}

}
