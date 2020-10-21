class laptop
{
	String mod_name;
	String pro_id;
	int ram_size;
	double pro_speed;
	laptop(String mod_name,String pro_id,int ram_size,double pro_speed)
	{
		this.mod_name=mod_name;
		this.pro_id=pro_id;
		this.ram_size=ram_size;
		this.pro_speed=pro_speed;
		System.out.println("Model Name      : "+this.mod_name);
		System.out.println("Processor ID    : "+this.pro_id);
		System.out.println("Ram Size        : "+this.ram_size+" GB");
		System.out.println("Processor Speed : "+this.pro_speed+" Ghz");
	}
}
class employee
{
	String dept_name;
	int emp_id;
	String ename;
	double sal;
	employee(String dept_name,int emp_id,String ename,double sal)
	{
		this.dept_name=dept_name;
		this.emp_id=emp_id;
		this.ename=ename;
		this.sal=sal;
		System.out.println("Department Name : "+this.dept_name);
		System.out.println("Employee ID     : "+this.emp_id);
		System.out.println("Employee Name   : "+this.ename);
		System.out.println("Salary          : "+this.sal+" Rs");
	}
}
class driveapp
{
	public static void info(String x)
	{
		switch(x)
		{
			case "dell":{ new laptop("Dell","a1",4,2.70);}
			break;
			case "sony":{new laptop("Sony","a2",4,2.50);}
			break;
			case "badra":{new employee("Agent",1,"Badra",50000);}
			break;
			case "rudra":{new employee("Worker",2,"Rudra",25000);}
			break;
			default:{System.out.println("NO Matchings");}
		}
	}
		public static void main(String[]args)
		{
			info("badra");
		}
}