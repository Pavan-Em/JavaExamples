package employee;

 class dev extends employee
{
	String jd="DEVELOPER";

	dev(){}

	dev(int eid,String name,double sal)
	{
		super(eid,name,sal);
	}

	public void display()
	{
		super.display();
		System.out.println("Job D:"+jd);
	}

	public String toString()
	{
		super.toString();
		display();
		return "";
	}
}