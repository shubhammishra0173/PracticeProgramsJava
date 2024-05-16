package codewar;

public class eachStringCapital2 {

	public static void main(String[] args) {
		String captilaizeword ="";
		
		String str = "shubham mishra done";
		String []split=str.split(" ");
		for(String s : split)
		{
			String first = s.substring(0, 1);
			String last = s.substring(1);
			captilaizeword=captilaizeword+first.toUpperCase() +last +" ";
		}
		System.out.println(captilaizeword);
	}

}
