package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class rl1 {
	public static void main(String[] args) {
		display d = new display();
		MyThread t1 = new MyThread(d, "PAVAN");
		MyThread t2 = new MyThread(d, "TOOLS");
		t1.start();
		t2.start();
	}
}

class display
{
	ReentrantLock rl = new ReentrantLock();
	public void wish(String name)
	{
		rl.lock();
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning ");
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(name);
		}
		rl.unlock();
	}
}

class MyThread extends Thread
{
	display d;
	String name;
	MyThread(display d,String name)
	{
		this.d=d;
		this.name=name;		
	}
	
	public void run()
	{
		d.wish(name);
	}
}
