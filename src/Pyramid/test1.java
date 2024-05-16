package Pyramid;

import java.util.Scanner;

public class test1 {

	 public static void main(String args[] ) throws Exception {
	      main();

	    }
	    static void main()
	    {
	          Scanner s =new Scanner(System.in);
	        String name = s.nextLine();
	        char[] ch =name.toCharArray();
	        int num=0;
	        for(int i=0;i<name.length();i++)
	        {
	            if(ch[i]=='1')
	            {
	               num++;
	               // break;
	            }
	        }
	        System.out.println(num);
	    }
	}
