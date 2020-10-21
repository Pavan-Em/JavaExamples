package METHODS;

import java.util.Scanner;

public class Carrays {
	public static int[] readarray()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("ENter Array Size:");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("ENter Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
	}
	
	public static void printarray(int[] a)
	{
		System.out.print("Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int arraysum(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public static double arrayavg(int[]a)
	{
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			avg+=a[i];
		}
		avg/=a.length;
		return avg;
	}
}
