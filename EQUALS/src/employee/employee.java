package employee;

class employee
{
	private  int eid;
	private String ename;
	private double sal;

	//getter for eid
	public int geteid()
	{
		return eid;
	}

	//getter and setter for ename
	public String getename()
	{
		return ename;
	}
	public void setename(String ename)
	{
		this.ename=ename;
		System.out.println("The is Changed");
	}

	//getter and setter for salary
	public double getsal()
	{
		return sal;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
		System.out.println("Salary is Changed");
	}

	public employee(){}

	public employee(int eid,String ename,double sal)
	{
		this.eid=eid;
	    this.ename=ename;
		this.sal=sal;
	}

	public void display()
	{
		System.out.println("Employee ID:"+eid);
		System.out.println("EName      :"+ename);
		System.out.println("Salary     :"+sal);
	}

	public boolean equals(Object obj)
	{
		employee obj1=(employee)obj;
		return eid==obj1.eid &&
			   ename==obj1.ename &&
			   sal==obj1.sal;
	}


}