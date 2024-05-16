package SecondLargestArray;

public class thirdLargest9 {

	
	
	public static void main(String[] args) {
		int[]arr= {-1,-2,-2,-3,-7,-98,-78};
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
