package DOUBT;

public class superdoubt extends B{
	public static void main(String[] args) {
		 
		superdoubt obj = new superdoubt();
		obj.callme();
	}
	
	void callme()
	{
		System.out.println(this);
	}
}
class B
{
	
}
