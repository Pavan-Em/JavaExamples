interface i8
{
	static int i=10;

	static void test()
	{
		System.out.println("from i8");
	}
}

interface i9
{
	static int i=20;
}

class x implements i8,i9
{
	//static int i =20;
}
 class demo3
 {
	 public static void main(String[]args)
	 {
		 i8.test();
		 System.out.println(x.i);
	 }
 }