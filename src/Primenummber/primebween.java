package Primenummber;

public class primebween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int limit =100;

for(int i=3;i<100;i++)
{
boolean isprime=true;
for(int j =2;j<i;j++)
{
	
if(i%j==0)
{
	isprime = false;
	break;
}	

}
if(isprime)
{
System.out.print(i + " ");	
}
}
	}

}
