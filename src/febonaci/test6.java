package febonaci;

public class test6 {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,count=10;
		for( i =0;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
