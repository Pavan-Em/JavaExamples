package ADVANCE;

public class autoclosable {
	
	public static void main(String[] args) throws Exception {
		try(myclass m=new myclass())
		{
			m.read();
		}
		System.out.println("outside try class");
	}

}

class myclass implements AutoCloseable
{
	public void read()
	{
		System.out.println("Read Myclass");
	}
	
	public void close() throws Exception
	{
		System.out.println("Close Myclass");
	}
}
