package SecondLargestArray;

public class thirdLargst {

	static int largest(int []arr)
	{ int temp=0;
		for(int i=0;i<arr.length;i++)
		{ 
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[arr.length-3];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest(new int [] {1,3,4,56,76,56,45,34,23}));
	}

}
