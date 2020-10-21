class laptop 
{
	String product_id;
	int ram_size;
    double pro_speed;
}
class employee
{
	int empid;
	String ename;
	double salary;
}
class Assigdrive
{
public static void info(String x)
	{
	laptop dell=new laptop();
	laptop sony=new laptop();
	employee agent=new employee();
	employee worker=new employee();
	dell.product_id="a10";
	dell.ram_size=4;
	dell.pro_speed=2.70;
	sony.product_id="a20";
	sony.ram_size=4;
	sony.pro_speed=2.50;
	agent.empid=1;
	agent.ename="badra";
	agent.salary=30000;
	worker.empid=2;
	worker.ename="rudra";
	worker.salary=25000;
	switch(x)
		{
		case "dell":{ 
			System.out.println("Product ID: "+dell.product_id);
			System.out.println("Ram Size: "+dell.ram_size+" GB");
			System.out.println("Processor Speed: "+dell.pro_speed+" Ghz");
		            }
					break;
		case "sony":{ 
			System.out.println("Product ID: "+sony.product_id);
			System.out.println("Ram Size: "+sony.ram_size+" GB");
			System.out.println("Processor Speed: "+sony.pro_speed+" Ghz");
		            }
					break;
		case "agent":{ 
			System.out.println("Employee ID: "+agent.empid);
			System.out.println("Name: "+agent.ename);
			System.out.println("Salary: "+agent.salary+" Rs Only");
		            }
					break;
		case "worker":{ 
			System.out.println("Employee ID: "+worker.empid);
			System.out.println("Name: "+worker.ename);
			System.out.println("Salary: "+worker.salary+" Rs Only");
		            }
					break;
		default:{ System.out.println(" No Matchings");}
		}
	}
	public static void main(String[]args) 
	{
		
		info("pavan");
	}
}
