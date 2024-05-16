package ArmStrong;

public class test6 {
	public static void main(String[] args) {
	
		int num=155;
		int temp =num;
		int sum=0;
		while(num>0)
		{
			int digit = num%10;
			sum = sum +digit*digit*digit;
			num =num/10;
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}

}
