package missingnumber;

public class test2 {
	
	static int gettingmissnumber(int []a, int n)
	{
		
		int n_elements_sum= n*(n+1)/2;
		int sum=0;
		for(int i =0;i<n-1;i++)
		
			sum=sum+a[i];
			
			
		
		int num = n_elements_sum-sum;
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,5,6,7,8,9};
int n = a.length+1;
int miss = gettingmissnumber(a, n);
System.out.println(miss);
	}

}
