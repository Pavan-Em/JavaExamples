package employee;
import java.util.Scanner;

class employeedriver
{
	public static empinfo createemp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println('Enetr Job ID:");
		int jobid=s.nextInt();
		System.out.println("Enter the Name:");
		String ename=s.next();
		System.out.println("Enter the Salary:");
		double sal=s.nectDouble();
		switch(jobid)
		{
			case 1:{
				System.out.println(ename+" joined the company as TEST ENGINEER");
				return new te(ename,sal);
			}
			case 2:{
				System.out.println(ename+" joined the company as DEVELOPER");
				return new dev(ename,sal);
			}
			default:{
				System.out.println("We dont have Job like taht.");
				return null;
			}
		}
	}
}