package removeZero;

public class pushZero6 {

	static void pushZerotoEnd(int[]arr)
	{
		int n =arr.length;
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
		int[]arr= {12,0,4,0,3,0,4,1};
		pushZerotoEnd(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
