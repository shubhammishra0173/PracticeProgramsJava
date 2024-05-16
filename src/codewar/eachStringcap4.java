package codewar;

public class eachStringcap4 {

	public static void main(String[] args) {
		String str = "test done by me";
		String [] split = str.split(" ");
		String captializedword = "";
		for(String s :split)
		{
			String firstChar = s.substring(0,1);
			String lastChar = s.substring(1);
			captializedword =captializedword +firstChar.toUpperCase()+lastChar+" ";
		}
		System.out.println(captializedword);

	}

}
