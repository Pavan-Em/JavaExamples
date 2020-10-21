package MATHODS;

import java.util.Arrays;
import java.util.Random;

public class array2d {
	public static void main(String[] args) {
		Random r=new Random();
		int[][] a=new int[3][3];
		int[][] b=new int[4][5];
		for(int i=0;i<a.length;i++)
			for(int k=0;k<a[i].length;k++)
				a[i][k]=r.nextInt(9)+1;
		
		for(int i=0;i<b.length;i++)
			for(int k=0;k<b[i].length;k++)
				b[i][k]=r.nextInt(9)+1;
		
		System.out.println("this is my first array");
		printarray(a);
		System.out.println("=========================");
		System.out.println("this is my second array");
		printarray(b);
		
		System.out.println("===============");
		System.out.println(Arrays.deepToString(a));
	}
	
	public static void printarray(int[][] a)
	{
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+"  ");
			}
			System.out.println();
		}
	}
	
	
}
