package inheritance;

public class main extends test1 {

	private int m = 20;
	public void obj()
	{
		System.out.println("this is child  class");
	}

	public static void main(String[] args) {
		
		//main m = new main();
		//main m = new test1();
		main m = new main();
		//m.obj();
		System.out.println(m.m);
	}

}
