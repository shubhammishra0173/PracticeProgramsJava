package removeZero;

public class pushZero5 {

	static void pushZero(int[]arr, int n)
	{
		int count=0;
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
		
int[]arr= {1,0,0,3,0,5,0,6,7};
int n=arr.length;
pushZero(arr,n);
for(int i =0;i<arr.length;i++)
{
System.out.println(arr[i]);	
}

	}

}
