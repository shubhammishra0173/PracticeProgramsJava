package pivot;

public class test5 {
	int partiton(int arr[],int low,int high)
	{
		
		int n = arr.length;
		int pivot = arr[high];
		int i = (low-1);
		for(int j =low;j<high;j++)
		{
			
			if(arr[j]<pivot)
			{
				i++;
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp =arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
void sort(int arr[],int low,int high)
{
if(low<high)
{
int pi =partiton(arr, low, high);
sort(arr,low,pi-1);
sort(arr,pi+1,high);

}

}
static void printarray(int arr[])
{
int n = arr.length;
for(int i =0;i<n;i++)

{
System.out.print(arr[i] +" ");	
System.out.println();
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {12,34,11,10,8,9,5,3,6,2};
		int n = arr.length;
		test5 test = new test5();
		test.sort(arr, 0, n-1);
		printarray(arr);
	}

}
