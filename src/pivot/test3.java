package pivot;

public class test3 {
	
	int partition(int arr[],int low,int high)
	{ int n = arr.length;
		int pivot = arr[high];
		int i = (low-1);
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
		
	}
	void sort (int arr[], int low,int high)
	{
		if(low<high)
		{
			
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	static void printarray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [] arr= {12,34,7,8,9,5,6};
		int n =arr.length;
	test3 test = new test3();
	test.sort(arr, 0, n-1);
		System.out.println("Sorted array");
		printarray(arr);
		
	}

}
