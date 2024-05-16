package ArrayPrograms;

import java.util.Arrays;

public class equalityofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arrone = {12,3,4,5,6,67,76,7,888};
		int[]arrtwo = {12,3,4,5,6,67,888,7,76};
		Arrays.sort(arrone);
		Arrays.sort(arrtwo);
		boolean equalornot = true;
		if(arrone.length == arrtwo.length)
		{
			for(int i =0;i<arrone.length;i++)
			{
				if(arrone[i]!=arrtwo[i])
				{
					equalornot =false;
				}
			}
			
		}
		else {
			equalornot =true;
		}
		if(equalornot)
		{
			System.out.println("both array is equal");
		}
		else
		{
			System.out.println("both array is not equal");
		}

	}

}
