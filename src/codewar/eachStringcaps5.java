package codewar;

public class eachStringcaps5 {

	public static void main(String[] args) {
			String s = "test done by me test";
			String[]split = s.split(" ");
			String captializeWord = "";
			for(String st :split)
			{
				String firstword = st.substring(0,1);
				String afterword = st.substring(1);
				captializeWord =captializeWord + firstword.toUpperCase()+afterword.toLowerCase()+" ";
			}
System.out.println(captializeWord);
	}

}
