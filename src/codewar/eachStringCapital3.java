package codewar;

public class eachStringCapital3 {

	public static void main(String[] args) {
		String str = "test do and die";
		 String[]split = str.split(" ");
		 String capitalizeWord ="";
		 for(String w :split)
		 {
			 String firstword = w.substring(0, 1);
			 String afterword = w.substring(1);
			 capitalizeWord=capitalizeWord+firstword.toUpperCase()+afterword+" ";
		 }
System.out.println(capitalizeWord);
	}

}
