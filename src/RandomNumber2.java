import java.util.ArrayList;
import java.util.Random;

public class RandomNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int pv = 0 , nv =0;
		ArrayList<Integer> as = new ArrayList<Integer>();
		ArrayList<Integer> as1 = new ArrayList<Integer>();
		for(int k =1;k<=50;k++)

	{
	for(int m =1 ;m<=k+1;m++)
	{
		int randomNumber1 = random.nextInt(k)-m  ;
				
		if(randomNumber1>1)
		{
			pv = pv+ randomNumber1;
			System.out.println(pv);
		}
		if(randomNumber1<1)
		{
			
			nv = nv+ randomNumber1;
			System.out.println(nv);
		}
		if(randomNumber1%2 == 0 )
		{
			as.add(randomNumber1);
		}
		if(randomNumber1%2 != 0 )
		{
			as1.add(randomNumber1);
		}
	}
			
	}
		 System.out.println(pv);
		  System.out.println(nv);
		  System.out.println(as);
		  System.out.println(as1);
		  System.out.println("size is "+as.size());
		  System.out.println("size is "+as1.size());
	}

}
