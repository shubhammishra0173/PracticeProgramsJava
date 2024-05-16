package collections;

import java.util.ArrayList;
import java.util.List;

public class ListObj {

	public static void main(String[] args) {
	List<Object>list =new ArrayList<>();
	list.add("shubham");
	list.add(12);
	list.add(123.45);
	for(Object l : list)
	{
		System.out.println(l);

	}
	String str = null ;
	System.out.println(str);
	

	}

}
