package Primenummber;

public class checkPrimenumber {

	public static void main(String[] args) {
		int num =18;
		boolean isprime =true;
		for(int i =2;i<num/2;i++)
		{ 
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			
		}
		if(isprime)
		{
			System.out.println("number is prime");
		}

	}

}
