package removeZero;

public class pushZero1 {
	
	static void pushBackzero(int[]arr ,int n)
	{
		int count =0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++] =arr[i];
			}
		}  
		while(count<n)
		{
			arr[count++]=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {12,3,0,4,0,0,5,6,7,8};
		int n = arr.length;
		pushBackzero(arr, n);
	for(int i =0;i<n;i++)
	{
		System.out.println(arr[i] +" ");
	}

	}

}
