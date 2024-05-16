package SplitAlphaNumeric;

public class sumOfNumvalue {

	public static void main(String[] args) {
		String s ="sda23fsd45fds5";
		String temp="0";
		int sum=0;
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else
			{
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp));

	}

}
