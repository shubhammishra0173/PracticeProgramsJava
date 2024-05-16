package Primenummber;

public class betweenprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int num=100;
		for(int i=1;i<num;i++)
		{
			boolean isprime =true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime =false;
					break;
				}
			}
			
			if(isprime)
			{
				System.out.print(i + " ");
			}
		}
	}

}
