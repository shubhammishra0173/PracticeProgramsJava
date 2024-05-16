package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class compareTwoString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "sadgfds";
		String s2 = "dsjawe";
		char[]ch = s1.toCharArray();
		char[]ch2 = s2.toCharArray();
		
		Set<Character>set = new HashSet();
		Set<Character>set1 = new HashSet();
		for(char c :ch)
		{
			set.add(c);
		}
		for(char ch1:ch2)
		{
			set1.add(ch1);
		}
		set.retainAll(set1);
		System.out.println(set);
	}

}
