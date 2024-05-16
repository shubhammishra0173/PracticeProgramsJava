package multiinheritanceinterfacepra;

 class mainclass implements test,test1{
public void print() {
	System.out.println("printable");
}
public void show(){System.out.println("Welcome");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainclass obj = new mainclass();
		obj.print();
		obj.show();
	}

	@Override
	public void testing() {
		
		
	}

}
