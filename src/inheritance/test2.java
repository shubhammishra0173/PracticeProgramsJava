package inheritance;

public class test2 extends main{
	public void obj()
	{
		System.out.println("this is sub child  class");
	}

	public static void main(String[] args) {
		
		//test1 m = new test2();
	main m = new test2();
		//test2 m = new main();
		m.obj();
	}


}
