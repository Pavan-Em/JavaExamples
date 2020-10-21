package MATHODS;

import java.util.Arrays;
import java.util.Random;

public class countrs {
	public static void main(String[] args) {
		Random r=new Random();
		int[] f=new int[10];
		for(int i=1;i<2000;i++)
		{
			++f[1+r.nextInt(9)];
		}
		
		for(int k=1;k<f.length;k++)
		{
			System.out.println(k+"\t"+f[k]);
		}
		
		System.out.println(Arrays.toString(f));
	}
}
