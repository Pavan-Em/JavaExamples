class drive4
{
	public static void main(String[]args)
	{
		//not possible this gives run time error
		A obj1=new A();
		System.out.println(((B)obj1).j);
		System.out.println(((B)obj1).b);
		((B)obj1).fromb();
		((B)obj1).testb();
	}
}