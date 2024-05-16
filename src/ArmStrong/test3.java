package ArmStrong;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =153;int c=0;
		int temp=num;
		while(num!=0)
		{
			int a = num%10;
			c= c+a*a*a;
			num = num/10;
		}
		if(c==temp)
		{
			System.out.println("number is armstrong");
		}
	}

}
