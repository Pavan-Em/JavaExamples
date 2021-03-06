package employee;

abstract class employee implements empinfo,empsal
{
    private static int no_of_emp;
	private int eid;

	//getter for no_of_emp and eid
	public static int getnoofemp()
	{
		return no_of_emp;
	}
	public  int geteid()
	{
		return eid;
	}
    
	//to give atomatic eid
	{
		no_of_emp++;
		eid=no_of_emp;
	}

	private String ename;
	
	//getter and setter for ename
	public  String getename()
	{
		return ename;
	}
	public  void setename(String ename)
	{
		this.ename=ename;
	}

	private double sal;

	//getter and setter for sal
	public  double getsal()
	{
		return sal;
	}
	public  void setsal(double sal)
	{
		this.sal=sal;
	}

	//constructors
	public employee(){}

	public employee(String ename,double sal)
	{
		this.ename=ename;
		this.sal=sal;
	}

	public void displayinfo()
	{
		System.out.println("Employee ID:"+eid);
		System.out.println("Name       :"+ename);
		System.out.println("Salary     :"+sal+" Rs");
	}

	public void paysal()
	{
		System.out.println("Salary "+sal+"/- Rs is demposited to "+ename+" Account");
			
	}
}