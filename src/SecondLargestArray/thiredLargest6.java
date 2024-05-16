package SecondLargestArray;

public class thiredLargest6 {

	public static int thirdLargest(int []arr, int total)
	{
		int temp;
		for(int i =0;i<total;i++)
		{
			for(int j =i+1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		return arr[total-3];
	}
	
	
	public static void main(String[] args) {
		
int []arr= {1,2,3,5,6,78,76,75};
int total=arr.length;
System.out.println(thirdLargest(arr,total));
	}

}
