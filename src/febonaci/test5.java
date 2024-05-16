package febonaci;

public class test5 {

	public static void main(String[] args) {
		
		int n=10,n1=0,n3,n2=1;
		
for(int i =0;i<n;i++)
{
	n3 = n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	}
	}

}
