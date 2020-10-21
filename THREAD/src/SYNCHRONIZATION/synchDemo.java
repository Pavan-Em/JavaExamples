package SYNCHRONIZATION;

public class synchDemo {
	public static void main(String[] args) throws InterruptedException {
		Display d1=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d1, "Pavan");
		MyThread t2=new MyThread(d2, "Tools");
		t1.start();
		t2.start();
	}
}

class Display
{
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good MOrnning ");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	public MyThread(Display d,String name)
	{
		this.name=name;
		this.d=d;
	}
	
	public void run()
	{
		d.wish(name);
	}
}






