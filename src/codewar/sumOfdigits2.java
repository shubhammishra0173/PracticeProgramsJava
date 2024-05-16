package codewar;

public class sumOfdigits2 {

	
		
		public static int digitsum(int n)
		{
			while(n>=10)
			{ int sum=0;
				while(n!=0) {
				int temp=n%10;
				sum=sum+temp;
				n=n/10;
			
			}
			n=sum;
			}
			return n;
		}
		
		
		public static void main(String[] args) {
			System.out.println(digitsum(12));
			System.out.println(digitsum(167));
			System.out.println(digitsum(1672));
	}

}
