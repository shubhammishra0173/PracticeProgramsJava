package StringPrograms;

public class accum6 {

	static String accum(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			sb.append(Character.toUpperCase(ch));
			for(int j =0;j<i;j++)
			{
				sb.append(Character.toLowerCase(ch));
			}
			if(i!=s.length())
			{
				sb.append("-");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
	
System.out.println(accum("shubh"));
	}

}
