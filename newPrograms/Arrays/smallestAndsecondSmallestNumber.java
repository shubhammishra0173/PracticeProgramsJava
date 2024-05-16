package Arrays;

public class smallestAndsecondSmallestNumber {

	
	private static void getSmallestandSecondSmallestarray(int[]arr)
	{
		int smallest = arr[0];
		int secondsmallest = arr[1];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];  
			}
			else if(arr[i]>smallest && arr[i]<secondsmallest)
			{
				secondsmallest =arr[i];
			}
		}
		System.out.println("Smallest number in the array is==============");
		System.out.println(smallest);
		
		System.out.println("Second Smallest number in the array is==============");
		System.out.println(secondsmallest);

		
	}
	
	public static void main(String[] args) {
		getSmallestandSecondSmallestarray(new int [] {12,3,4,5,67,32,32,35,22,2,1,3,52,-6});
	}

}
