package oddeveninString;

public class testWithCollection {

	public static void main(String[] args) {
		String str ="123456764";
		int evencount=0,oddcount=0;
		for(int i =0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			
			int value= Character.getNumericValue(ch);
			if(value%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
System.out.println(evencount+" "+oddcount);
	}

}
