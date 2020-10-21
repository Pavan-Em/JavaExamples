class employee
{
	int eid;
	String ename;
	double sal;
    employee()
	{
		System.out.println("Give Input");
	}
	employee(int e)
	{
		eid=e;
		System.out.println("Employee ID : "+eid);
	}
	employee(int e,String n)
	{
		this(e);
		ename=n;
		System.out.println("Employee Name : "+ename);
	}
	employee(int e,String n,double s)
	{
		this(e,n);
		sal=s;
		System.out.println("Salary : "+sal+" Rs");
	}
}
class empdrivedoubt
{
	public static void main(String[]args)
	{
		employee vee=new employee(1,"VEERBADRA",55000);//we can write print stmt here also
		employee baa=new employee(2,"BADRA",25000);
        System.out.println("salary of "+baa.ename+" is  "+baa.sal);
	}
}
