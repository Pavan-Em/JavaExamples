package BASIC;

public class basic2 {
	
	public static void main(String[] args) {
	gen<String> obj1=new gen<String>("Pavan");
	obj1.show();
	String name=obj1.getobj();
	System.out.println("String : "+name);
	System.out.println("===================================");
	gen<Integer> obj2=new gen<Integer>(420);
	obj2.show();
	Integer name2=obj2.getobj();
	System.out.println("Integer : "+name2);
	System.out.println("====================================");
	gen<Double> obj3=new gen<Double>(420.02);
	obj3.show();
	Double name3=obj3.getobj();
	System.out.println("Double : "+name3);
	
	}
}

class gen<T>
{
	T obj;
	
	public gen(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("The Type of obj is "+obj.getClass().getName());
	}
	
	public T getobj()
	{
		return obj;
	}
}
