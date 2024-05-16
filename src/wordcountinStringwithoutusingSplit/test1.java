package wordcountinStringwithoutusingSplit;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PythonProgramJavaProgramPython";
		
		int count =0;
		for(int i =0;i<str.length()-6;i++)
		{
			if(str.substring(i, i+7).equalsIgnoreCase("Program"))
			{
				count++;
			}
			 
		}
		System.out.println("The word 'Program' occurs " + count + " times in the string.");
		
	}

}
