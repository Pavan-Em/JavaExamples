package dev;
import employee.employee;
public class dev extends employee{
	
	dev(){}
	public dev(String code, String ename, double esal, boolean em_status) {
		super( code,ename, esal, em_status);
		// TODO Auto-generated constructor stub
	}

	String jd="DEVELOPER";
	
	//display info
	public void display()
	{
		super .display();
		System.out.println("Emp JD      :"+jd);
	}
	
	//override toString()
		public String toString()
		{
			display();
			return "";
		}
	
	//override equals()
	public boolean equals(Object obj)
	{
		if(obj instanceof dev)
			return super.equals(obj);
		return false;
	}
	
	//override hashCode()
	public int hashCode()
	{
		return super.hashCode()+jd.hashCode();
	}

}
