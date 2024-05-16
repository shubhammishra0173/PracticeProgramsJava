package ArmStrong;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0,a,temp;
int n =153;
temp=n;
while(n!=0)
{
a=n%10;
n=n/10;
c=c+n*n*n;

}
if(c==temp)
{
System.out.println("number is armstrong");	
}
else
{
System.out.println("number is not armstrong");	
}
	}

}
