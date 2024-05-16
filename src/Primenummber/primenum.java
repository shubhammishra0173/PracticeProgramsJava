package Primenummber;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100,temp;
		boolean isprime =true;
		for(int i=2;i<num;i++)
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
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
		

	}

}
