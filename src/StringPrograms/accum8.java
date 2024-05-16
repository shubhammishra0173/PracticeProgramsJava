package StringPrograms;

public class accum8 {

	static String accum(String s)
	{
		StringBuilder sb= new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			char c =s.charAt(i);
			sb.append(Character.toUpperCase(c));
			for(int j=0;j<i;j++)
			{
				sb.append(Character.toLowerCase(c));
			}
			if(i!=s.length())
			{
				sb.append("-");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(accum("shubham"));

	}

}
