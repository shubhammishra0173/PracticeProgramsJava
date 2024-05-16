package codewar;

public class sumOfdigits3 {

	public static int digitsum(int n)
	{
		while(n>=10)
		{
			int sum =0;
			while(n!=0)
			{
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}
		return n;
	}
	
	public static void main(String[] args) {
		
System.out.println(digitsum(16));
	}

}
