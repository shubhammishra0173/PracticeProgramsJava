package stringProbablity;

import java.util.Scanner;

public class test2 {


	static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    // function that rotates s towards right by d 
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
 
    // Driver code
    public static void main(String args[])
    {
            String str1 = "GeeksforGeeks"; 
        String s =    rightrotate(str1, 1);
        String s1 =    leftrotate(str1, 1);
        String temp ="";
        char []ch1 =s.toCharArray();
        char []ch2= s1.toCharArray();
        for(int i =0;i<str1.length();i++)
        {
        temp = ch1[i]+temp;	
        temp = temp+ch2[i];
        }
        System.out.println(temp);
        
    }
}