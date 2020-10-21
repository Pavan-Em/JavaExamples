package BASIC;

import java.util.Arrays;

public class a4 {
	
	String name;
	
	a4(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		a4[] obj=new a4[4];
		obj[0]=new a4("Lilly");
		obj[1]=new a4("Smith");
		obj[2]=new a4("Manga");
		obj[3]=new a4("Denga");
		System.out.println(obj[0]);//if you"re not over toString it"ll just give reference 
		System.out.println("===============================");
		System.out.println(obj);
		System.out.println("===============================");
		System.out.println(Arrays.toString(obj));		
		System.out.println("\n========example for Integer======\n");	
		int[] a= {1,8,9,7,6};
		System.out.println(a[0]);
		System.out.println("==================================");
		System.out.println(a);
		System.out.println("==================================");
		System.out.println(Arrays.toString(a));
		System.out.println("===========================");
	
		
		
	}
	
	//override toString to return name
	public String toString()
	{
		return name;
	}

}
