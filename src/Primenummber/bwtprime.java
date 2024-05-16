package Primenummber;

public class bwtprime {

	public static void main(String[] args) {
		int num =100;
		boolean isPrime =true;
		for(int i =1;i<num;i++)
		{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
			else
			{
				isPrime=true;
			}
		}
		if(isPrime)
		{
			System.out.println(i);
		}
			
		}
		

	}

}
