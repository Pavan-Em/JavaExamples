import java.util.Scanner;
class s2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the sentence :");
		String sen=s.next();
		char let=sen.charAt(2);
		System.out.println("The sentence is:"+let);
	}
}