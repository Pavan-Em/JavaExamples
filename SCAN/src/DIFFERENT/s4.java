package DIFFERENT;

import java.util.Random;

//random
public class s4 {
	public static void main(String[] args) {
		Random r=new Random();
		int a=r.nextInt(999999);
		int b=r.nextInt(999999);
		System.out.println(a);
		System.out.println(b);
		
		int[]  num=new int[100];
		for(int i=0;i<num.length;i++)
		{
			num[i]=r.nextInt(999999);
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}
