package oddeveninString;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		String str ="12345678";
		List<Integer>list =new ArrayList<>();
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int n = Character.getNumericValue(ch);
			list.add(n);
		}
		int evencount=0;
		int oddcount =0;
		for(int value:list)
		{
			if(value%2==0)
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
