package missingnumber;

public class test4 {

	static int getMissingnumber(int[]arr, int n)
	{
		int arrsum=0;
		int sum = n*(n+1)/2;
		
		for(int i =0;i<arr.length;i++)
			
		{
			arrsum = arrsum+arr[i];
		}
		int missingnumber = sum -arrsum;
		return missingnumber;
	}
	public static void main(String[] args) {
		
		int[]arr= {1,3,4,5,6,7,8};
		int n = 8;
		System.out.println(getMissingnumber(arr,n));
	}

}
