package Arrrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = {12,34,56,76,56,23,89};
int temp;
for(int i =0;i<num.length;i++)
{
for(int j=i+1;j<num.length;j++)
{
if(num[i]>num[j])

{
temp =num[i];
num[i]=num[j];
num[j]=temp;
}
}
System.out.println(num[i]);
}
	}

}
