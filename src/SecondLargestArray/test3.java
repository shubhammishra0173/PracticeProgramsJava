package SecondLargestArray;

public class test3 {

	public static void main(String[] args) {

		int largest =0;
		int secondlargest =0;
		int[]arr = {12,34,56,76,45,32,89,87};
		
				for(int i =0;i<arr.length;i++)
				{
					if(arr[i]>largest)
					{
						secondlargest=largest;
						largest =arr[i];
					}
					if(arr[i]<largest && arr[i]>secondlargest)
					{
						secondlargest=arr[i];
					}
				}
				System.out.println(secondlargest);

	}

}
