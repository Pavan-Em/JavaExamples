package COMPANY;
import java.util.Scanner;

import EMPLOYEE.employee;
public class company 
{
	private String CompanyName;
	public final employee[] emp=new employee[3];
	private static int no_of_employee=0;
	
	//getter and setter for CompanyName
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	//getter and setter for no_of_employee
	public static int getNo_of_employee() {
		return no_of_employee;
	}
	public static void setNo_of_employee(int no_of_employee) {
		company.no_of_employee = no_of_employee;
	}
	
	//constructor
	company(){}
	public company(String companyName) {
		this.CompanyName = companyName;
	}
	
	public void addemployee(employee e)
	{
		if(no_of_employee<emp.length)
		{
			emp[no_of_employee++]=e;
			System.out.println("Employee Added to the Company");
		}
		else
			System.out.println("No Vaczncy in the Company");
	}
	
	//search employee by eid
	public employee searchbyeid()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Emp ID to Search:");
		int eid=s.nextInt();
		for(int i=0;i<emp.length;i++)
		{
			if(eid==emp[i].getEid())
			{
				System.out.println("Employee Found");
				return emp[i];
			}
		}
		System.out.println("Employee Not Found");
		return null;
	}
	
	//to remove employee based on eid
	public employee removebyeid()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Emp ID to Remove:");
		int eid=s.nextInt();
		for(int i=0;i<emp.length;i++)
		{
			if(eid==emp[i].getEid())
			{
				employee temp=emp[i];
				emp[i]=null;
				System.out.println("Employee Removed Successfully");
				return temp;
			}
		}
		System.out.println("Employee With that Emp ID:"+eid+" is not Existed");
		return null;
	}
	
	//to change name using eid
	public employee changenamebyeid()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Emp ID to Change Name");
		int eid=s.nextInt();
		s.nextLine();
		for(int i=0;i<emp.length;i++)
		{
			if(eid==emp[i].getEid())
			{
				no_of_employee--;//we have some issue here bug fucking bug
				String oldname=emp[i].getName();
				System.out.print("Enter New Name:");
				String newname=s.nextLine().trim();
				emp[i].setName(newname);
				System.out.println("Emp Name "+oldname+" Changed to "+newname);
				return emp[i];
			}
		}
		System.out.println("Employee with Emp ID:"+eid+" is not found");
		return null;
	}
}
