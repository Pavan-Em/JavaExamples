interface i1
{
	void print();
}
interface i2 
{
	void display();
}
class x implements i1,i2
{
	public void print()
	{
		System.out.println("from i1");
	}
	public void display()
	{
		System.out.println("from i2");
	}
}

class demo8
{
	public static void main(String[]args)
	{
		i2 obj=new x();
		((i1)obj).print();
		obj.display();
	}
}