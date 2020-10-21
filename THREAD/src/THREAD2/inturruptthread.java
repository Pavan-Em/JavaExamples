package THREAD2;

public class inturruptthread {

	public static void main(String[] args) throws InterruptedException {
		myintrrupt t=new myintrrupt();
		t.start();
		t.join();
		t.interrupt();
		//t.join();
		System.out.println("Hehe i got it");
	}
}

class myintrrupt extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Lazy Thread");
				if(i==5)
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Im interrupted");
		}
	}
}
