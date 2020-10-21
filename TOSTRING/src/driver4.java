class A
{
	public String toString()
	{
		System.out.println("from A");
		return super.toString();
	}
}

class driver4
{
	public static void main(String[]args)
	{
		A obj=new A();
		System.out.println(obj);
	}
}