class employee
{
	int eid;
	String ename;
	double sal;
    employee()
	{
		System.out.println("Give Input");
	}
	employee(int eid)
	{
		this.eid=eid;
		System.out.println("Employee ID : "+eid);
	}
	employee(int eid,String ename)
	{
		this(eid);
		this.ename=ename;
		System.out.println("Employee Name : "+ename);
	}
	employee(int eid,String ename,double sal)
	{
		this(eid,ename);
		this(eid);
		this.sal=sal;
		System.out.println("Salary : "+sal+" Rs");
	}
}
class empdrive
{
	public static void main(String[]args)
	{
		new employee(1,"VEERBADRA",55000);//we can write print stmt here also
	}
}