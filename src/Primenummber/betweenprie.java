package Primenummber;

public class betweenprie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =100;
	
		for(int i =3;i<100;i++)
		{	boolean isprime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isprime=false;
			break;	
			}
		}
		if(isprime)
		{
			System.out.println(i);
		}
		}
	}

}
