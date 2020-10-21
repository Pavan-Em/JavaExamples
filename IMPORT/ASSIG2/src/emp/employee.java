package emp;
import emp.te.te;
import emp.dev.dev;
public class employee
{
	private static int no_of_emp;
	public int eid;
	{
		no_of_emp++;
		eid=no_of_emp;
	}

	//getter for no_of_emp
	public int getnoofemp()
	{
		return no_of_emp;
	}

	public String ename;
	
	//constructor
	public employee()
	{
		no_of_emp--;
		eid=no_of_emp;
	}
	public employee(String ename)
	{
		this.ename=ename;
	}
    
	//get details through company
	public void displayempdetails(employee e)
	{
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Name       :"+e.ename);
		if(e instanceof te)
		{
			System.out.println("Job Desc   :"+((te)e).getjd());
			System.out.println("Salary     :"+((te)e).getsalary()+" Rs");
		}
		if(e instanceof dev)
		{
			System.out.println("Job Desc   :"+((dev)e).getjd());
			System.out.println("Salary     :"+((dev)e).getsalary()+" Rs");
		}
	}
	 //get directly by name from driver class
	/*public void mydetails(employee e)
	{
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Name       :"+e.ename);
		System.out.println("Job Desc   :"+e.getjd());
		System.out.println("Salary     :"+e.getsalary());
	}*/
}