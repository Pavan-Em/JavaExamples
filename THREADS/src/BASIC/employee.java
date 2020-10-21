package BASIC;

public class employee extends Thread {

	String name;
	int id;
	double sal;
	String blood;
	
	public employee(String name,int id,double sal,String blood)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.blood=blood;
	}
	
	public void run()
	{
		/*System.out.println("Emp id    :  "+id);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Emp Name  :  "+name);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Emp Salary:  "+sal);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Blood Grp :  "+blood);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		display();
	
		//print();
		/*try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
	}
	
	public void display()
	{
		System.out.println("Emp id    :  "+id);
	
		System.out.println("Emp Name  :  "+name);
		
		System.out.println("Emp Salary:  "+sal);
	
		System.out.println("Blood Grp :  "+blood);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void print()
	{
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
	}
}
