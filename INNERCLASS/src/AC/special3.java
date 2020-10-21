package AC;

public class special3 {
	
	public static void main(String[] args) {
		outer obj=new outer();
		obj.object();
	}

}

class outer
{
	
	public void object()
	{
		int n=100;
		
		class inner
		{
			public void innerobject()
			{
				System.out.println(n);
			}
		}
		
		inner o=new inner();
		o.innerobject();
	}
}
