import java.util.Scanner;
class s3
{
	public static void main(String[]args)
	{
		String ss="yes of yesh";
		Scanner s=new Scanner(ss);
		System.out.println(s.hasNext());
		System.out.println(s.nextLine());
		System.out.println(s.hasNext());
		System.out.println(s.nextLine());//no linr error //run time error
	}

}