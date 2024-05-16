package removeZero;

public class pushZero3 {

	static void pushZero(int[] arr)
	{
		int count =0;
		int n =arr.length;
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
		
		int[] a = {1,0,0,3,4,0,0,98,0,9,8,7}; 
	 pushZero(a);
	 for(int i =0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }

	}

}
