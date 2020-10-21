class A
{
	static int a=3;
	static
	{
		System.out.println("A");
	}
}
class B extends A
{
	static int b=6;
	static
	{
		System.out.println("B");
	}
}
class doubt8
{
	public static void main(String[]args)
	{
		System.out.println(B.a);//its fucking impt read the below discription
	
		
	}
}
//OUTPUT
//A
//3
//only execute class A bcoz java is memory eff and it follw lazy instantiation
//only when u use class name
//when u use obj ref it'll give diff answer