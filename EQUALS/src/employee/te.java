package employee;

class te extends employee
{
	public String jd="TEST ENGG";

	public te(){}

	public te(int eid,String ename,double sal)
	{
		super (eid,ename,sal);
	}

	public void display()
	{
		super.display();
		System.out.println("Job D      :"+jd);
	}

	public String toString()
	{
		display();
		return "";
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof te)
		    return super.equals(obj) ;
		return false;//DESIG DIFFERS
	}     //USE ANY EQUALS() IF YOU WANT TO COMPARE JD ALSO USE BELOW ONE

	/*public boolean equals(Object obj)
	{
		if(obj instanceof te)
		{
			return super.equals(obj);
		}
		if(obj instanceof dev)
		{
			return super.equals(obj) && jd==((dev)obj).jd;
		}
		return false;*/
	}
}