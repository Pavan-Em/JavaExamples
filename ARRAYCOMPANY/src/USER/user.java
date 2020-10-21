package USER;
import EMPLOYEEDRIVER.employeedriver;
import EMPLOYEE.employee;

import java.util.Arrays;

import COMPANY.company;
public class user {
	public static void main(String[] args) {
		company amazon=employeedriver.addcompany("AMAZON");
		System.out.println("Comapny Name:"+amazon.getCompanyName());
		employeedriver.addemployee();
		employeedriver.addemployee();
		employeedriver.addemployee();
		for(int i=0;i<amazon.emp.length;i++)
		{
			System.out.println(amazon.emp[i]);
		}
		System.out.println("==============================");
		employee s=amazon.searchbyeid();
		if(s!=null)
			System.out.println(s);
		System.out.println("==================================");
		employee n=amazon.changenamebyeid();
		if(n!=null)
			System.out.println(n);
		System.out.println("==============================");
		employee r=amazon.removebyeid();
		if(r!=null)
			System.out.println(r);
		System.out.println("==================================");
		for(int i=0;i<amazon.emp.length;i++)
		{
			if(amazon.emp[i]==null)
			{
				amazon.emp[i]=employeedriver.addemployee();
				break;
			}
			if(i==amazon.emp.length-1)
				System.out.println("No vacancy");
		}
	}
}
