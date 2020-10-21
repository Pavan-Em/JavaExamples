interface calci
{
	void add(int a,int b);
}
class cal1 implements calci
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

class cal2 extends cal1 //implements calci
{
	public void add(int a,int b)
	{
		super.add(a,b);
		int o=a+b;
		System.out.println(a+"+"+b+"="+ o);
	}
}
class user1
{
	public static void main(String[]args)
	{
		calci obj=new cal2();
		obj.add(10,20);
		calci obj1=new cal1();
		obj1.add(20,60);
	}
}
