package overriding;

public class bike extends vehicle{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
	  vehicle obj = new bike();//creating object  
	  obj.run();//calling method  
	  }  
	}  