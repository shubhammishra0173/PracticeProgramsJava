package SplitAlphaNumeric;

public class test46 {

	public static void main(String[] args) {
		String str = "34shu4h3h12hdsdsf5";
		String temp ="0";
		int sum=0;
		for(int i =0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{
				temp=temp+c;
			}
			else
			{
				sum =sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp));
	}

}
