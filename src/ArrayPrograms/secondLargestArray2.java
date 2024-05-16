package ArrayPrograms;

public class secondLargestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {12,3,4,5,61,34};
		int firstlargest , secondlargest=0;
		if(arr[0]>arr[1])
		{
			firstlargest =arr[0];
			secondlargest=arr[1];
		}
		else
		{
			firstlargest =arr[1];
			secondlargest=arr[0];	
		}
		for(int i =2;i<arr.length;i++)
		{
			if (arr[i]>firstlargest) {
			secondlargest =firstlargest;
			firstlargest =arr[i];
			}
			else if(arr[i]<firstlargest && arr[i]>secondlargest)
			{
				secondlargest =arr[i];
			}
		}
		System.out.println(secondlargest);
	}

}
