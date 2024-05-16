package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class comparetwoString1 {

	public static void main(String[] args) {
		
		String s1 = "Shubham";
		String s2 = "Mishra";
		Set<Character> set = new HashSet<>();
		Set<Character> set1 = new HashSet<>();
		char[] ch = s1.toCharArray();
		char[]ch1= s2.toCharArray();
		for(char c :ch)
		{
			set.add(c);
		}
		for(char ch2 :ch1)
		{
			set1.add(ch2);
		}
		set.retainAll(set1);
		System.out.println(set);
	}

}
