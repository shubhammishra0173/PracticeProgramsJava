package SecondLargestArray;

public class secondlargest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr = {12,34,56,65,543,455,45,654,678};

int largest = 0;
int secondlargest =0;

for(int i =0;i<arr.length;i++)
{
if(arr[i]>largest)
{
secondlargest = largest;
largest = arr[i];

}
if(arr[i]<largest && arr[i]>secondlargest)
{
secondlargest =arr[i];	
}

}
System.out.println(secondlargest);
	}

}
