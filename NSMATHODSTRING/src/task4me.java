import java.util.Scanner;
public class task4me {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=s.nextLine().trim();
		System.out.println("Entered String:"+str);
		String str2=str.toUpperCase();
		String rev1="";
		for (int i=0;i<str2.length();i++)
		{
			//System.out.print(""+(char)(str2.charAt(i)+(32*(i%2))));
			rev1=rev1+(char)(str2.charAt(i)+(32*(i%2)));
		}
		System.out.println("Reveresed String ULULUL:"+rev1);
		//System.out.println();
		String str3=str.toLowerCase();
		String rev2="";
		for (int i=0;i<str2.length();i++)
		{
			//System.out.print(""+(char)(str3.charAt(i)-(32*(i%2))));
			rev2=rev2+(char)(str3.charAt(i)-(32*(i%2)));
		}
		System.out.println("Reveresed String LULULU:"+rev2);
		s.close();
		}
}
