package FOREACH;

import java.util.Arrays;

public class f1 {
	public static void main(String[] args) {
		int []  a= {1,2,9,4,6};
		for(int x:a)
			System.out.println(x);
		
		
		int[][]  b= {{1,8,6},{9,5,7,9}};
	
		for(int i=0;i<b.length;i++)
		{
			System.out.println(Arrays.toString(b[i]));
		}
	}
}
