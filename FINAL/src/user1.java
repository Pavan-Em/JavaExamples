final class A
{

	static int i=10;
	

}

class user1 
{
	public static void main(String[]args)
	{
		System.out.println(A.i);
		A.i=20;
		System.out.println(A.i);
	}
}