package removeDuplicateArray;

import java.util.Arrays;

public class removeDuplicatechar {

	static void removeDuplicateChar(String s)
	{
		int noofuniquels = s.length();
		char []ch =s.toCharArray();
		for(int i =0;i<noofuniquels;i++)
		{
			for(int j =i+1;j<noofuniquels;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=ch[noofuniquels-1];
					j--;
					noofuniquels--;
				}
			}
		}
		char[]withoutDup = Arrays.copyOf(ch, noofuniquels);
		for(int i =0;i<withoutDup.length;i++)
		{
			System.out.print(withoutDup[i]);
		}
	}
	
	public static void main(String[] args) {
		
		removeDuplicateChar("shubham");
	}

}
