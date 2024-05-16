package oddeveninString;

public class testwithoutCollection6 {

	public static void main(String[] args) {

		String num= "12345238945";
		int evencount =0;
		int oddcount =0;
		
		
		for(int i =0;i<num.length();i++)
		{
			char c = num.charAt(i);
			int n = Character.getNumericValue(c);
			if(n%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
		}
		System.out.println(evencount +" "+oddcount);

	}

}
