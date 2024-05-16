package Arrrays;

public class rid_extraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input= " hello     there   ";
		String output = input.trim().replaceAll("\\s+", " ");
		System.out.println(output);
	}

}
