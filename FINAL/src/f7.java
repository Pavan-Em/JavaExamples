class f7
{
	  static int i=30;
	final int j;

	f7(int i,int j)
	{
		this.i=i;
		this.j=j;
	}

	public static void main(String[]args)
	{
		f7 obj=new f7(10,20);
		System.out.println(obj.i);
		System.out.println(obj.j);
		f7 obj1=new f7(89,30);
		System.out.println(obj1.i);
		System.out.println(obj1.j);

	}
}