package oddeveninString;

import java.util.ArrayList;
import java.util.List;

public class testWithcol {
public static void main(String[] args) {
	
	String str = "123433535";
	List<Integer>list = new ArrayList<>();
	
	for(int i =0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		int num = Character.getNumericValue(ch);
		list.add(num);
	}
	int oddcount=0;
	int evencount=0;
	for(int n :list)
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
