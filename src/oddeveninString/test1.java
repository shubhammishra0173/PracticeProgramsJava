package oddeveninString;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		String s= "12345678";
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			int num =Character.getNumericValue(ch);
			list.add(num);
					
		}
		int evencount=0;
		int oddcount=0;
		for(int num:list)
		{
			if(num%2==0)
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


