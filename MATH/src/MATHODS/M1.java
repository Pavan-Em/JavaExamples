package MATHODS;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class M1 {
	public static void main(String[] args) 
	{
		Random r=new Random();
		r.nextInt(10);
		Scanner s=new Scanner(System.in);
		String a=generaterandomstring(5);
		System.out.println(a);
		String st=String.format("%d",25);
		char[] ch= {'a','b','c','d','e','f','g','h'};
		System.out.println(String.valueOf(ch, 2, 3));
	}
	
	public static String generaterandomstring(int a)
	{
		char[] ch=new char[a/2+1];
		int[] num=new int[a/2+1];
		String r="";
		for(int i=0;i<a/2+1;i++)
		{
			Random random=new Random();
			//num[i]=random.nextInt(10);
			num[i]=(int)(Math.random()*10);
			r+=num[i];
			ch[i]=(char)((int)(Math.random()*26)+65);
		}
		String rev=Arrays.toString(num).replaceAll("\\[|\\]|,|\\s", "");
		System.out.println(r);
		System.out.println(rev);
		return String.valueOf(ch)+rev;
		
	}
}
