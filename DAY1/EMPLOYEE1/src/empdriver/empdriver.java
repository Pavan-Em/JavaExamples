package empdriver;
import java.util.Scanner;
import te.te;
import dev.dev;
import employee.employee;
public class empdriver
{
	static int eid;
	static String ename;
	static double esal;
	static String code;
	public static employee addemp()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr the Emp Name:");
		ename=s.nextLine().trim().toUpperCase();
		System.out.print("Enetr the Emp Sal:");
		esal=s.nextDouble();
		code=(employee.getcom_name().substring(0,3)).concat(ename.substring(0,3));
		//s.close();
		return createemp();
		
	}
	
	public static employee createemp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Respective Dept Num to ADD:");
		System.out.println("Enetr 1 for TEST ENGG");
		System.out.println("Enter 2 for DEVELOPER");
		System.out.println("Enter 0 to EXIT");
		System.out.print("Enter the Number:");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.print("Enter 1 for Married\nEnetr 2 for Single\nEnetr the NUmber:");
			int m=s.nextInt();
			switch(m)
			 {
			    case 1:{ return new te(code,ename,esal,true);}
			    case 2:{ return new te(code,ename,esal,false);}
			    default:{ System.out.println("Error");
			            return null;}
			}
			
		}
		case 2:
		{
			System.out.print("Enter 1 for Married\nEnetr 2 for Single\nEnetr the NUmber:");
			int m=s.nextInt();
			switch(m)
			 {
			    case 1:{ return new dev(code,ename,esal,true);}
			    case 2:{ return new dev(code,ename,esal,false);}
			    default:{ System.out.println("Error");
			            return null;}
			}
		}
	
		case 0:
		{
			return null;
		}
		default:{ System.out.println("Error");
		return null;}
		}
		
	}
}

	
