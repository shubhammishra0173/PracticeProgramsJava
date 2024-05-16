package missingnumber;

public class test5 {

	static int missingNum(int[]arr, int n)
	{
		int sum = n*(n+1)/2;
		int total=0;
		
		for(int i =0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		int missingnumber = sum-total;
		return missingnumber;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3,5, 6,7};
	    int n = a.length + 1;
	    int miss = missingNum(a, n);
	     
	    System.out.print(miss);
}
}
