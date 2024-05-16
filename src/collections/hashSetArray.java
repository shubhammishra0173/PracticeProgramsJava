package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashSetArray {

	public static void main(String[] args) {

	HashSet<String>flower_set = new HashSet<>();
	flower_set.add("test");
	flower_set.add("test");
	flower_set.add("test");
	flower_set.add("test1");
	flower_set.add("test2");
	flower_set.add("test3");
	List<String>list = new ArrayList<String>(flower_set);
	System.out.println(list);
	
	
	
	
	}

}
