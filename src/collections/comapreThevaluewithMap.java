package collections;

import java.util.Map;

public class comapreThevaluewithMap {

	public boolean test(Map<Object,Object>maps) {
	boolean status =true;
	if(maps.containsValue("value"))
	{
		status =true;
	}
	else
	{
		status =false;
	}
	return status;
	}
	
	public static void main(String[] args) {
		

	}

}
