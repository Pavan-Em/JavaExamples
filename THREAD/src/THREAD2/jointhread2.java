package THREAD2;

public class jointhread2 {

	public static void main(String[] args) throws InterruptedException {
		myjoin3.mt=Thread.currentThread();
		myjoin3 t=new myjoin3();
		t.start();
		Thread.currentThread().join(6000);
		for(int i=0;i<10;i++)
		{
			//t.join(3000);
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}

class myjoin3 extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join(5000);
		}
		catch(InterruptedException e) {}
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
		}
	}
}
