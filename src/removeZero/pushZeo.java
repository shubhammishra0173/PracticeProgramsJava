package removeZero;

public class pushZeo {

	static void pushzerotoend(int arr[],int n)
	{
		int count =0;
		for(int i =0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
				
			}
			
		}
		while(count<n)
		{
			arr[count++]=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,34,56,12,340,0,0,12,0};
	int n =arr.length;
	pushzerotoend(arr, n);
	for(int i=0;i<n;i++)
	{
		
		System.out.println(arr[i] +" ");
	}
	}

}
