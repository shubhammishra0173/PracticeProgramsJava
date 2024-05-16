package neartoZero;

public class test4 {
static void nearZero(int[]arr)
{
int near = arr[0]*arr[0];
int curr =0;
for(int i =0;i<arr.length;i++)
{ curr=arr[i]*arr[i];
if(curr<=near)	
{
near=arr[i];	
}
}
System.out.println(near);
}
	
	public static void main(String[] args) {
		
		nearZero(new int []  {12,3,4,5,1,1,2,3,21,2,3});

	}

}
