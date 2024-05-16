package neartoZero;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data= {4,3,5};
int curr=0;
int near =data[0];
Arrays.sort(data);
for(int i =0;i<data.length;i++)
{
curr=data[i]*data[i];
if(curr<=near*near)
{
near=data[i];	
}
}
System.out.println(near);
	}

}
