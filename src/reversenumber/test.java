package reversenumber;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1234;
		int reversenum=0;
		while(num!=0)
		{
			int digit= num%10;
			reversenum=reversenum*10+digit;
			num=num/10;
		}
		System.out.println(reversenum);
	}

}
