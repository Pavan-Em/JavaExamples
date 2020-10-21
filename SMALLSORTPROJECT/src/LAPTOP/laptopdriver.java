package LAPTOP;
import java.util.Arrays;
public class laptopdriver {
	public static void main(String[] args) {
		laptop[] lap=new laptop[3];
		lap[0]=new laptop(1,"DELL",6);
		lap[1]=new laptop(2,"SONY",4);
		lap[2]=new laptop(3,"AVEATOR",8);
		System.out.println("Before Sorting");
		for(int i=0;i<lap.length;i++)
		{
			System.out.println(lap[i]);
		}
		Arrays.sort(lap,new sortbyeid());
		System.out.println("=========================");
		System.out.println("Sorted by Product ID");
		for(int i=0;i<lap.length;i++)
		{
			System.out.println(lap[i]);
		}
		Arrays.sort(lap,new sortbyname());
		System.out.println("=========================");
		System.out.println("Sorted by Product Name");
		for(int i=0;i<lap.length;i++)
		{
			System.out.println(lap[i]);
		}
		Arrays.sort(lap,new sortbyramsize());
		System.out.println("=========================");
		System.out.println("Sorted by Ram Size");
		for(int i=0;i<lap.length;i++)
		{
			System.out.println(lap[i]);
		}
		
		
		
	}
}
