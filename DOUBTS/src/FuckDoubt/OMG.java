package FuckDoubt;

public class OMG extends Got{
	
	ok object = new ok();
	static OMG obj;
	public static void main(String[] args) throws Exception {
		 obj = new OMG();
		obj.omgcall();
	}	
	
	public void omgcall() throws Exception
	{
		n=10;
		m=20;
		object.no();
		callcall();
	}
	
	public void callcall() throws Exception
	{
		gotit();
		Thread.sleep(1000);
		object.oh(obj);
	}
}


class Got
{
	int n;
	static int m;
	public void gotit()
	{
		System.out.println(n);
		System.out.println(m);
	}
}

class ok extends Got
{
	
	public void no()
	{
		n=1;
		m=2;
	}
	public void oh(OMG obj) throws Exception
	{
		gotit();
		Thread.sleep(1000);
		obj.callcall();
	}
}
