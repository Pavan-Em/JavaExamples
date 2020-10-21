package driver;
import company.company;
import emp.employee;
import emp.te.te;
import emp.dev.dev;

class driver
{
	public static void main(String[]args)
	{
		company goog=new company();
		company google=new company("GOOGLE");
		System.out.println("Company Name:"+google.comp_name);
		System.out.println("==============================");
		company ms=new company("MICROSOFT");
		System.out.println("Company Name:"+ms.comp_name);
		System.out.println("==============================");
		te badra=new te("Badra");
		dev rudra=new dev("Rudra");
		google.addemployee(badra);
		System.out.println("==============================");
		google.e.displayempdetails(badra);
		System.out.println("==============================");
		google.e.displayempdetails(rudra);
		badra.setsalary(90000);
		System.out.println("Badra's salary:"+badra.getsalary());

	}
}