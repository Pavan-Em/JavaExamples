class  rohansir
{
	int a=5;
	int b=yo(4);
	{
		int a=3;
		System.out.println(a);
		yo(6);
		System.out.println("yes");
	}
	public static int yo(int x)
	{
		System.out.println(x);
		return 9;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		rohansir res=new rohansir();
		System.out.println(res.b);
		System.out.println("main end");
	}
}
//OUTPUT
//main begin
//4
//3
//6
//yes
//9(b already assigned with return value)
//main end
//TOP TO BOTTOEM INITIALIZER GETS EXECUTED..
