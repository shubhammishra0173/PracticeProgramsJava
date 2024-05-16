package wordoccurance;

public class Test {

	public static void main(String[] args) {
		String str = "test test done by us test";
		String occ = "test";
		String [] split = str.split(" ");
		int count =0;
		for(int i =0;i<split.length;i++)
		{
			if(occ.equals(split[i]))
			{
			count++;
			}
			
		}
		System.out.println("The text "+ occ+" is occured "+ count +" times");

	}

}
