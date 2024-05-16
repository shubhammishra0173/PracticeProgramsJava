package ArmStrong;

public class test8 {

	public static void main(String[] args) {
		
		int sum =0,c ,temp;
		int n =153;
		temp =n;
		
		while(n!=0)
		{
			c = n%10;
			sum=sum+c*c*c;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");	
		}
		
		

	}

}
