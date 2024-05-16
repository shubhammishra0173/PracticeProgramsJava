package SecondLargestArray;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {12,34,57,56,55,56};
int largest = 0;
int secondlargest =0;
for(int i =0;i<arr.length;i++) {
	
	if(arr[i]>largest)
	{
		secondlargest=largest;
		largest =arr[i];
	}
	else if(arr[i]>secondlargest&&arr[i]!=largest)
	{
		secondlargest =arr[i];
	}
}
System.out.println(secondlargest);
System.out.println(largest);
}

}
