package employee;

abstract class employee implements emp
{
	int eid;
	String name;
	double sal;

	employee(){}

	employee(int eid,String name,double sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}

	public void display()
	{
		System.out.println("EID   :"+eid);
		System.out.println("EName :"+name);
		System.out.println("Salary:"+sal);
	}

	/*public String toString()
	{
		display();
		return "";
	}*/
}