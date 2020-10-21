package pack2;
import pack1.B;




class drive
{
	static
	{
		System.out.println("static from drive");
	}
	public static void main(String[]args)
	{
		System.out.println("i:"+B.i);
		System.out.println("j:"+B.j);
		
	}
}