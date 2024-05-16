package oddeveninString;

import java.util.ArrayList;
import java.util.List;

public class withcoll {
	
	public static void main(String[] args) {
		String s = "1234567";
		List<Integer> list = new ArrayList<>();
		  
	for(int i=0;i<s.length();i++)
	{
		char ch =s.charAt(i);
		int n = Character.getNumericValue(ch);
		list.add(n);
		
	}
	for(int num:list)
	{
		if(num%2==0)
		{
			
		}
		else
		{
			
		}
	}
	}

}
