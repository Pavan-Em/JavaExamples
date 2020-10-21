interface A
{
	String toString();
}
class B implements A
{
	public String toString()
	{
		System.out.println(super.toString());
		System.out.println("from B");
		return null;
	}
}

class C extends B
{
	public String toString()
	{
		System.out.println(super.toString());
		System.out.println("from C");
		return null;
	}
}

class driver2
{
	public static void main(String[]args)
	{
		A obj=new C();
		System.out.println(obj);
	}
}