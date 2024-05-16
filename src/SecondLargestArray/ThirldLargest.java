package SecondLargestArray;

public class ThirldLargest {

	public static void main(String[] args) {

		int[] arr= {234,54,67,89,89,34,56,56,78};
		int temp=0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println(arr[arr.length-3]);
	}

}
