package THREAD2;

public class jointhread {

	public static void main(String[] args) throws InterruptedException {
		myjoin t=new myjoin();
		myjoin t1=new myjoin();
		//t.start();
		//t.join();
		//t1.start();
		myjoin2 t3=new myjoin2();
		t3.start();
		t3.join(5000);
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
}

class myjoin extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("child Thread");
	}
}

class myjoin2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
