package codewar;

public class sumofDigit4 {

	public static int sumOfdigit(int n)
	{
		while(n>=10)
		{
			int sum=0;
			while(n!=0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			n=sum;
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfdigit(16));

	}

}
