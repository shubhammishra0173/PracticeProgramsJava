package SecondLargestArray;

public class secondLargest6 {

	public static void main(String[] args) {
		int[]arr= {12,43,45,6,745,322,13};
		int largest =0;
		int secondLargest=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest =largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);

	}

}
