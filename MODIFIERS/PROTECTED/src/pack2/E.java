package pack2;

import pack1.A;

public class E extends A
{
	public static void main(String []args)
	{
		E obj1=new E();//if constructor is protected still cts
		System.out.println("using sub class obj ref "+ obj1.i);//cts
		//A obj2=new A();//if constructor is protected itll give cte
		/*System.out.println("using super class obj ref "+obj2.i);//cte
		A obj3=obj1;
		System.out.println(obj3.i);//cte*/
	}
}

//we can use protected members in sub class(diff side package) with the help pf sub class obj ref
//we can't use protected member in sub class(diff side package) with the help of super class obj ref