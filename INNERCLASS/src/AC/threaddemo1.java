package AC;

public class threaddemo1 {
	
	public static void main(String[] args) {
		
		mythread t=new mythread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Mian Thread");
		}
		mythread t1=new mythread();
		t1.start();
	}

}


class mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
