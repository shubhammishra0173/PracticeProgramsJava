package oddeveninString;

public class testwithoutCollection2 {

	public static void main(String[] args) {
		String str = "2432346411539";
		int evenCount=0;
		int oddCount =0;
		for(int i =0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			int n = Character.getNumericValue(ch);
			if(n%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println(evenCount +" "+oddCount);

	}

}
