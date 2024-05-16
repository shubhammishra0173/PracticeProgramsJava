package removeZero;

public class sepearateodd {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,12,43,7};
		seperateevenOdd(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
static void seperateevenOdd(int[]arr)
{
int left=0;
int right=arr.length-1;
while(left<right)
{
while(arr[left]%2==0 && left<right)
{
left++;	
}
while(arr[right]%2!=0 && left<right)
{
right--;	
}
if(left<right)
{
int temp =arr[left];
arr[left]=arr[right];
arr[right]=temp;
}
}
}
}
