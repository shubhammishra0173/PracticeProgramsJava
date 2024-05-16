package StringPrograms;

public class subSt {

	public static void main(String[] args) {
		String s = "abcabcabc";
		String substring = checkSubstringisempty(s);
		if(substring!=null)
		{ int count=0;
			for(int i =0;i<substring.length();i++)
			{
				count++;
			}
			System.out.println("The repeated count "+count);
		}
		else
		{
			System.out.println("String is not duplicate");
		}

	}
	static String checkSubstringisempty(String s)
	{
		int length=s.length();
		for(int i =1;i<=s.length()/2;i++)
		{
			String substring= s.substring(0,i);
			int count=length/i;
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<count;j++)
			{
			sb.append(substring);
			if(sb.toString().equals(s))
			{
				return substring;
			}
			}
		}
		return null;
	}

}
