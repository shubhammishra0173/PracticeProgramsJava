package missingnumber;

public class test10 {

	
	static double missingnumber(int[]arr,int m)
	{
		double  sum =0;
		int n = arr.length;
		double total = m*(m+1)/2;
		for(int i =0;i<n;i++) {
		sum = sum +arr[i];
		}
		double missingnumber= total-sum;
		
		return missingnumber;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6,7,8,9};
		int n =9;
		System.out.println(missingnumber(arr,n));
	}

}
