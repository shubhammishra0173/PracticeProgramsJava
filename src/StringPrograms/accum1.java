    
package StringPrograms;

public class accum1 {

	static void accum(String s)
	{
		StringBuilder result=new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			result.append(Character.toUpperCase(ch));
			for(int j=0;j<i;j++)
			{
				result.append(Character.toLowerCase(ch));
			}
			if(s.length()!=i)
			{
				result.append("-");
			}
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		accum("shubh");
	}

}
