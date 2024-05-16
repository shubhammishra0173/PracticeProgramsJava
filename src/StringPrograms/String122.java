package StringPrograms;

import java.util.Scanner;

public class String122{

	
	 public static void main(String []args)
	    {
	        Scanner sobjr = new Scanner(System.in);
	        System.out.println("Enter 9  Numbers of first Matrix:");
	        int [][]M = new int [3][3];
	        for (int i=0;i<M.length;i++)
	        {
	            for (int j=0;j<M[i].length;j++)
	            {
	                System.out.print("M["+ i +"]["+j+"]=");
	                M[i][j]= sobjr.nextInt();
	            }
	        }
	        System.out.println();

	        System.out.println("First Matrix is:");
	        for (int i=0;i<M.length;i++)
	        {
	            for(int j=0;j<M[i].length;j++)
	                System.out.print("M["+ i +"]["+j+"]="+M[i][j]+"\t");
	            System.out.println("\n");
	        }
	        System.out.println("Enter 9 values of Second Matrix:");

	        int N[][] = new int [3][3];
	        for(int i=0;i<N.length;i++)
	        {
	            for(int j=0;j<N[i].length;j++)
	            {
	                System.out.print("N["+i+"]["+j+"]=");
	                N[i][j] = sobjr.nextInt();
	                System.out.print("\n");
	            }
	        }
	        System.out.println("Second Matrix is:");
	        for (int i=0;i<N.length;i++)
	        {
	            for(int j=0;j<M[i].length;j++)
	                System.out.print("N["+i+"]["+j+"]="+N[i][j]+"\t");
	        }
	        System.out.println();
	    }

	}