package SecondLargestArray;

public class test {

	static int thirdlargest(int[]n)
	{
		int temp =0;
		int m =n.length;
		for(int i=0;i<n.length;i++)
		{
			for(int j =i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		return n[m-3];
	}
	
	public static void main(String[] args) {
		System.out.println(thirdlargest(new int[] {1,3,4,56,76,56,45,34,23}));

	}

}
