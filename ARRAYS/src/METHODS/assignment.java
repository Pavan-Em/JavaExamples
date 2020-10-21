package METHODS;

import java.util.Arrays;
import java.util.Scanner;

public class assignment {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENter num of Friends:");
		int n=s.nextInt();
		s.nextLine();
		String[] name=new String[n];
		System.out.println("Enter name of Friends:");
		for(int i=0;i<name.length;i++)
		{
			name[i]=s.nextLine().trim();
		}
		System.out.println("Names of friends without Sorting:");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("Names of friends after sorting:");
		Arrays.sort(name);
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}
}
