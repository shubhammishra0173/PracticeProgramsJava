package StringPrograms;

public class subString4 {

	public static void main(String[] args) {
		String s1 ="ababab";
		String substring = findRepeatedstring(s1);
		
		if(substring!=null)
		{
			System.out.println("The subString repeated count is "+substring);
		}
		else
		{
			System.out.println("String is not repeateable");
		}

	}
	static String findRepeatedstring(String s) {
		int length = s.length();
		for(int i =1;i<s.length()/2;i++)
		{
			String substring = s.substring(0,i);
			int count = length/i;
			StringBuilder sb =new StringBuilder();
			for(int j=0;j<count;j++)
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
