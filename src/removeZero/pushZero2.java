package removeZero;

public class pushZero2 {

	static void pushBackzero(int []arr, int n)
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
		
int[]arr = {0,12,3,0,0,12,1,2,0,4};
int n = arr.length;
pushBackzero(arr, n);

/*for(int i =0;i<n;i++)
{
System.out.print(arr[i] +" ");	
}*/
for(int i :arr)
{
System.out.println(i);	
}
	}

}
