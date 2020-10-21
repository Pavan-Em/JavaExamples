class  nsdoubt4
{
	int a=4;
	{
		System.out.println(5);
	}
	nsdoubt4()
	{
		
		System.out.println(6);
	}
	public static void main(String[] args) 
	{
		nsdoubt4 b=new nsdoubt4();
		b.yo();
	}
	public static void yo()
	{
		System.out.println(7);
	}
}

//OUTPUT
//5
//6
//7