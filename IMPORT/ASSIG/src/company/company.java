package company;
import emp.employee;
import emp.te.te;
import emp.dev.dev;

public class company
{
	public employee e=new employee();
	public String com_name;
	public company(){}
	public company(String com_name)
	{

		this.com_name=com_name;
	}

	public void addemp(employee e)
	{
		System.out.println(e.ename+" is added to the Company");
	}
	/*public void displaydetails(employee e)
	{
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Name       :"+e.ename);
		if(e instanceof te)
			System.out.println("Job DES:"+((te)e).jd);//we can display details here also
		if(e instanceof dev)
			System.out.println("Job DES:"+((dev)e).jd);
		
	}*/

}