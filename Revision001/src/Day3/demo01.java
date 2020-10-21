package Day3;

import java.util.Arrays;
import java.util.Random;

public class demo01 {

	public static void main(String[] args) {
		String code = new String(generateCode(6));
		System.out.println(code);
		
	}
	
	public static StringBuilder generateCode(int n)
	{
		int[] num = new int[n/2];
		char[] cha = new char[n/2];
		Random r = new Random();
		StringBuilder s = new StringBuilder();
		for(int i=0 ; i<num.length;i++)
		{
			num[i]=r.nextInt(10);
			cha[i]=(char)(r.nextInt(26)+65);
			s=s.append(cha[i]).append(num[i]);
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(cha));
		return s;
	}
}
