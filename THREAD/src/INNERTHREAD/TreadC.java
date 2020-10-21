package INNERTHREAD;

public class TreadC {
	public static void main(String[] args) throws InterruptedException {
		ThreadD t=new ThreadD();
		t.start();
     	t.join();
		synchronized(t)
		{
			System.out.println("haha");
		t.wait(1000);
		}
		System.out.println(t.total);
		
	}										
}

class ThreadD extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("hey");
			for(int i=1;i<=100;i++)
				total+=i;
			this.notify();
		}
		for(int i=0;i<20;i++)
		{
			System.out.println("Child Thread");
		}
	}
}


