package permutation;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
permutation("abc");
	}
public static void permutation(String input)
{
	permutation("",input);
}
public static void permutation(String perm, String word)
{
if(word.isEmpty())	
{
	
System.err.println(perm+word);}
else {
	
for(int i =0;i<word.length();i++)
{
permutation(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));	
}
}


}
}
