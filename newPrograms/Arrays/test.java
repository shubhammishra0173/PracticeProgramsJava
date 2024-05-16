package Arrays;

import java.util.Scanner;

public class test {

	public static void main(String []args){
		Scanner sobjr=new Scanner(System.in);
		int M[][]= new int[3][3];
		System.out.println("Enter 9 Numbers: ");
		for(int r=0;r<M.length;r++)
		{
			for(int c=0;c<M[r].length;c++)
		    {
		     System.out.print("M["+r+"]["+c+"]=");
		     M[r][c]= sobjr.nextInt();
		    }
		 }

		for(int r=0;r<M.length;r++)
		{
			for(int c=0;c<M[r].length;c++)
				 System.out.print("M["+r+"]["+c+"]="+M[r][c]+"\t");
			     System.out.println();
		}
		for (int []row:M)
		{ 
			for(int val:row)
			System.out.print(val + " ");
			
			    System.out.println();
			   			
			}
			    
	    
	for(int  [] odd : M)
	{
		for(int val : odd)
		{
			if(val%2 == 0)
			{
				System.out.print("number is even "+val);
				System.out.println();
			}
			else {
				System.out.print("number is odd "+val);
				System.out.println();
			}
		}
	}
	// prime number code 
	for(int  [] odd : M)
	{
		for(int val : odd)
		{
			int num = val;
			
			int temp;
			boolean isprime=true;
			for(int i =2;i<num/2;i++)
			{ temp =num%i;
				if(temp ==0)
					
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				System.out.println("Number is prime "+num);
			}
	}	
	
	}
	}
		
}

		


	