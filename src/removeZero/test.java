package removeZero;

public class test {
	
	static void pushtoZero(int[]n,int m)
	{
		int count =0;
		for(int i =0;i<m;i++)
	
		{
			if(n[i]!=0)
			{
				
				n[count++]=n[i];
			}
		}
		while(count<m)
		{
			n[count++]=0;
		}
	}

	public  static void main(String args[]) {
		// TODO Auto-generated method stub
System.out.println("hello");
int[]arr = {12,0,67,0,0,0,6,0,7,0,56};
	int m = arr.length;
	pushtoZero(arr, m);
	for(int i =0;i<m;i++)
	{
		
		System.out.println(arr[i] +" ");
	}
	}

}
