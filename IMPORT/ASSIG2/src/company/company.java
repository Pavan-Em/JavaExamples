package company;
import emp.employee;
import emp.te.te;
import emp.dev.dev;

public class company
{
	public String comp_name;
	public employee e=new employee();

	//constructor
	public company()
	{
		System.out.println("WARNING");
		System.out.println("Give a Company Name");
	}
	public company(String comp_name)
	{
		this.comp_name=comp_name;
	}

	//to add employee
	public void addemployee(employee e)
	{
		System.out.println(e.ename+" joined the Company");
	}

	//to pay salary
	public void paysalary(employee e)
	{
		System.out.println("Salary is paid to "+e.ename);
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Name       :"+e.ename);
		if(e instanceof te)
		{
			System.out.println("Job Desc:"+((te)e).getjd());
			System.out.println("Salary  :"+((te)e).getsalary());
		}
		if(e instanceof dev)
		{
			System.out.println("Job Desc:"+((dev)e).getjd());
			System.out.println("Salary  :"+((dev)e).getsalary());
		}
	}
}