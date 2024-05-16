 package StringPrograms;

import java.util.Set;
import java.util.TreeSet;

public class compareTwoString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "shubham";
		String s2 = "mishra";
		char[]ch1 = s1.replaceAll("\\s", "").toCharArray();
		char[]ch2 =s2.replaceAll("\\s", "").toCharArray();
		Set<Character> firststringset = new TreeSet<>();
		Set<Character> secondstringset = new TreeSet<>();
		for(char c :ch1)
		{
			firststringset.add(c);
		}
		for(char c :ch2)
		{
			secondstringset.add(c);
		}
		firststringset.retainAll(secondstringset);
		System.out.println(firststringset);
		
	}

}
