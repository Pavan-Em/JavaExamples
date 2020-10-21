package BASIC;

public class basic1 {
	public static void main(String[] args) {
		Gold g=new Gold("gold",5500);
		Silver s=new Silver("silver", 550);
		Account<Gold>  obj1=new Account<Gold>(g);
		Account<Silver> obj2=new Account<Silver>(s);
		obj1.show();
		System.out.println(obj1.getClass().getName());
		
	}

}


class Account<T>
{
	T obj;
	public Account(T obj)
	{
		this.obj=obj;
	}
	
	public void show()
	{
		System.out.println(obj.getClass().getName());
	}
	
}

class Gold
{
	double price;
	String name;
	
	public Gold(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
}

class Silver
{
	double price;
	String name;
	
	public Silver(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
}
