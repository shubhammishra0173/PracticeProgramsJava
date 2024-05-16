package wordcountinStringwithoutusingSplit;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "programingPythonPythonProgrammingPythonJavaPython";
	
	int count =0;
	for(int i =0;i<str.length()-5;i++)
	{ 
		if(str.substring(i, i+6).equalsIgnoreCase("Python"))
		{
			count++;
		}
	}
	System.out.println(count);
	}

}
