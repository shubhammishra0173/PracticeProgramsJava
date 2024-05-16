import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		 //Random rand = new Random();
		 int rand_int1 = 0;
		 int positive=0;
		  ArrayList<Integer>arr = new ArrayList<Integer>();
		  ArrayList<Integer>arr1 = new ArrayList<Integer>();
		  for(int i =1;i<50;i++)
		  {
	        // Generate random integers in range 0 to 999
	       //  rand_int1 = rand.nextInt(i);
	       // int rand_int2 = rand.nextInt(1000);
			  Random rand = new Random();
			 int va=rand.nextInt(i);
			 System.out.println(va);
	      //   System.out.println(va);
	         if(ThreadLocalRandom.current().nextInt(i)!=0)
	         {
	        	  System.out.println(va);
	         }
	  if(va>0)
	  {
		  positive=positive+va;  
	  }
	  if(va%2==0)
	  {
		arr.add(va);
	  }
	  
	  if(va%2!=0)
	  {
		arr1.add(va);
	  }
	  
	  
	}*/
		 /* System.out.println("psotive number is "+positive); 
		  System.out.println("even number is " +arr);
		  System.out.println("odd number is "+ arr1);*/
			Random random=new Random();
			int pv =0,nv=0;
			ArrayList<Integer> as = new ArrayList<Integer>();
			ArrayList<Integer> as1 = new ArrayList<Integer>();
			  			  for(int k =1;k<=1000;k++)
			  {
				  for(int m=1;m<=k+1;m++)
				  {
					  int randomNumber1=(random.nextInt(k)-m);
					  System.out.println("random is " +randomNumber1);
					
						  if(randomNumber1>0)
						  {
							  pv= pv+randomNumber1;
						  }
						  if(randomNumber1<0)
						  {
							  nv=nv+randomNumber1;
						  }
						  if(randomNumber1%2==0)
						  {
							  as.add(randomNumber1);
						  }
						  if(randomNumber1%2!=0)
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

