package wordcountinStringwithoutusingSplit;

public class test11 {

	public static void main(String[] args) {
		String str ="PythonProgramJavaProgramPython";
		int count=0;
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
