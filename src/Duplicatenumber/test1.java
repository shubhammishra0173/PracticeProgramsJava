package Duplicatenumber;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]num= {12,12,13,14,13,12,15,16,16};
int count;
for(int i=0;i<num.length;i++)
{
count =1;
for(int j= i+1;j<num.length;j++)
{
if(num[i]==num[j] && num[i]!=0)
{
	count++;
	num[j]=0;
	break;
}
}
if(count>1&&num[i]!=0)
{
System.out.println(num[i]);	
}
}
	}

}
