package EMPLOYEEDRIVER;
import EMPLOYEE.employee;
import TE.te;
import DEV.dev;
import COMPANY.company;
import java.util.Scanner;
public class employeedriver
{
	static company c;
	static String name;
	static double sal;
	
	//to create multiple company
	public static company addcompany(String companyname)
	{
		System.out.println("Company is Added");
		c=new company(companyname);
		return c;
	}
	
	public static employee addemployee()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter yout Full Name:");
		name=altername(s.nextLine().trim());
		return generateemployee(name);
	}
	
	public static String altername(String name)
	{
		String aname="";
		String[] sname=name.split(" ");
		for(int i=0;i<sname.length;i++)
		{
			aname+=sname[i].toUpperCase().charAt(0)+sname[i].substring(1,sname[i].length()).toLowerCase();
			aname+=" ";
		}
		return aname;
	}
	
	public static employee generateemployee(String name)
	{
		Scanner s=new Scanner(System.in);
		boolean mstatus=false;
		System.out.print("Enter 1 for TEST ENGG\nENter 2 for DEVELOPER\nEnter 0 for Exit\n");
		System.out.print("Enter yout Option:");
		int job=s.nextInt();
		System.out.print("Enter Salary:");
		sal=s.nextDouble();
		System.out.print("Enter 1 for Married\nEnter 2 for Single\n");
		System.out.print("Enter your Option:");
		int m=s.nextInt();
		if(m==1)
			mstatus=true;
		switch(job)
		{
		case 1:{
			employee e=new te(name,sal,mstatus);
			c.addemployee(e);
			return e;
		}
		case 2:{
			employee e=new dev(name,sal,mstatus);
			c.addemployee(e);
			return e;
		}
		case 0:{return null;}
		}
		return null;
		}
	
	}

