package wordcountinStringwithoutusingSplit;

public class test10 {

	public static void main(String[] args) {

String str = "shubhamisgoodprogrammerbutshubhamalwaysbeshubham";
int count=0;
for(int i =0;i<str.length()-6;i++)
{
if(str.substring(i, i+7).equalsIgnoreCase("shubham"))
{
count++;	
}
}
System.out.println(count);

	}

}
