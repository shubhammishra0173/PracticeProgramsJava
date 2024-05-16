package oddeveninString;

import java.util.ArrayList;
import java.util.List;

public class testwithcoll7 {

	public static void main(String[] args) {
		String str ="234567478";
		List<Integer>list = new ArrayList<>();
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int num = Character.getNumericValue(ch);
			list.add(num);
		}
		int evencount=0;
		int oddcount=0;
		for(int n : list)
		{
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
