interface i1
{
	void print();
}
interface i2 extends i1
{
	void display();
}
class x implements i2
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

class demo7
{
	public static void main(String[]args)
	{
		i2 obj=new x();
		obj.print();
		obj.display();
	}
}