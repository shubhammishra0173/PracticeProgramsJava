package SecondLargestArray;

public class secondLargest1 {

	public static void main(String[] args) {
		
		int largest=0;
		int secondlargest=0;
		int[]arr= {2,5,67,54,32,434,456,43};
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest =largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest)
			{
				secondlargest =arr[i];
			}
		}
		System.out.println(secondlargest);
		

	}

}
