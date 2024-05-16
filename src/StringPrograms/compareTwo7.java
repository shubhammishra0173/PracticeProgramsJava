package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class compareTwo7 {

	public static void main(String[] args) {
		String s1 = "shubham";
		String s2 ="mishra";
		char[]ch1 = s1.toCharArray();
		char[] ch2 =s2.toCharArray();
		Set<Character> set = new HashSet<>();
		Set<Character>set1 =new HashSet<>();
		
		for(char ch :ch1)
		{
		set.add(ch);	
		}
		for(char ch :ch2)
		{
			set1.add(ch);
		}
		set.retainAll(set1);
		System.out.println(set);

	}

}
