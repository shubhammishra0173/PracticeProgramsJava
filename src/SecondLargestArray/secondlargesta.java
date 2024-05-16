package SecondLargestArray;

public class secondlargesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,43,56,78,98,89,78};
		int largest =0;
		int secondlargest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest =arr[i];
				
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest=arr[i];
				
			}
		}
System.out.println(secondlargest);
System.out.println(largest);
	}

}
