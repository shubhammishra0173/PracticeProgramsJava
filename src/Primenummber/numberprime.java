package Primenummber;

public class numberprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =113,temp=0;
		boolean isprime=true;
		
		for(int i=2;i<num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
