package EXCEPTIONDOUBT;

public class doubt7 {
	
	public static void main(String[] args) {
		
	try(auto a=new auto())
	{
		a.read();
	}
	}

}

class auto implements AutoCloseable
{
	public void read()
	
	{
		System.out.println("im reading");
	}
	public void close() 
	{
		System.out.println("Im closing");
	}
}

