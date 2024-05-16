package SplitAlphaNumeric;

import java.util.Arrays;
import java.util.List;

public class sumOfnumEri {

	public static void main(String[] args) {
		String str="312dfhj21";
		String temp="0";
		int sum=0;
		
		for(int i =0;i<str.length();i++) {
	
			char ch =str.charAt(i);
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
