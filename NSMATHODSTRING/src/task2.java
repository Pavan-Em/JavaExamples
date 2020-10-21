import java.util.Scanner;
public class task2 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("ENter Name:");
		String name=s.nextLine().trim();
		System.out.print("Enter City");
		String city=s.nextLine().trim();
		boolean cc=name.toLowerCase().contains(city.toLowerCase().substring(0,3));
		if(cc)
			System.out.println("yea i got it");
		else
			System.out.println("no man bad luck");
	}
}
