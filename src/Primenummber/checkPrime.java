package Primenummber;

public class checkPrime {
	public static void main(String[] args) {
		
		int num =67;
		for(int i =1;i<num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime");
			}
			else 
			{
				System.out.println("number is prime");
			}
		}
	}

}
