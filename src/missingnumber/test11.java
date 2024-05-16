package missingnumber;

public class test11 {

	static double missingnmber(int[]arr, int n)
	{
	
		int sum = n*(n+1)/2;
		int arrsum=0;
		for(int i =0;i<arr.length;i++)
		{
			arrsum =arrsum+arr[i];
		}
		double missingnumber=sum-arrsum;
		return missingnumber;
		
	}
	
	public static void main(String[] args) {
		
		
		int n=8;
		int [] num = {1,2,3,5,6,7,8};
		System.out.println(missingnmber(num,n));
		

	}

}
