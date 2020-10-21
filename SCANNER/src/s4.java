import java.util.Scanner;
class s4
{
	public static void main(String[]args)
	{
		String s="pavan go fuck yourself";
		Scanner scan=new Scanner(s);
		System.out.println(scan.hasNext());
		while(scan.hasNext())
		System.out.println(scan.next().charAt(0));
		System.out.println(scan.hasNext());
	}
}