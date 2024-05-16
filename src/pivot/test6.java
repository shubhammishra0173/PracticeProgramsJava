package pivot;

public class test6 {

	int partition(int arr[],int low,int high)
	{
		int n = arr.length;
		int pivot = arr[high];
		int i = (low-1);
		for(int j =low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				
				i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
		
	}
	void sort (int arr[],int low, int high)
	{
		if(low<high)
		{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
