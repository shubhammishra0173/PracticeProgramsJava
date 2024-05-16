package Primenummber;

public class isprimebetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<100;i++)
		{
			boolean isprime=true;
			for(int j =2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
				else
				{
					isprime=true;
				}
			}
			if(isprime)
			{
				System.out.println(i +" ");
			}
		}
	}

}
