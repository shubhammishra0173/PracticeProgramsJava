package ArmStrong;

public class test5 {

	public static void main(String[] args) {
		int c =0,a,temp;
		int n =153;
		temp = n;
		
		while(n>0)
		{
			a=n%10;
			c=c+a*a*a;
			n=n/10;
		}
		if(c==temp)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
