 package codewar;

public class eachStringcap {

	public static void main(String[] args) {
		String str = "test done by me";
		String[]split=str.split(" ");
		String captilaizedWord ="";
		for(String w :split)
		{
			String Fistword = w.substring(0, 1);
			String afterWord = w.substring(1);
			captilaizedWord=captilaizedWord +Fistword.toUpperCase()+afterWord+" ";
			
		}
		System.out.println(captilaizedWord);

	}

}
