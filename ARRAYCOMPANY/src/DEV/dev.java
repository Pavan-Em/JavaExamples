package DEV;

import EMPLOYEE.employee;

public class dev extends employee{
	public String jobd="DEVELOPER";


	//constructor
	public dev(String name, double sal, boolean mstatus) {
		super( name, sal, mstatus);
	}
	
	public void displayinfo()
	{
		super.displayinfo();
		System.out.print("Emp JD     :"+jobd);
	}
	
	public String toString()
	{
		displayinfo();
		return "";
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof dev)
			return super.equals(obj);
		return false;
	}
	
	public int hashCode()
	{
		return super.hashCode()+jobd.hashCode();
	}
	
}
