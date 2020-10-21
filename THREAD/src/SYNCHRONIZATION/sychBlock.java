package SYNCHRONIZATION;

public class sychBlock {
	public static void main(String[] args) {
		Display2 d1=new Display2();
		Display2 d2=new Display2();
		MyThread4 t1=new MyThread4(d1, "Pavan");
		MyThread4 t2=new MyThread4(d2, "Tools");
		t1.start();
		t2.start();
	}
}

class Display2
{
	public void wish(String name)
	{
		;;;;;;;//lines of code
		synchronized(Display2.class)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print("Good Morning ");
				try
				{
					Thread.sleep(500);
				} catch(InterruptedException e) {}
				System.out.println(name);
			}
		}
		;;;;;;;//lines of code
	}
}

class MyThread4 extends Thread
{
	Display2 d;
	String name;
	public MyThread4(Display2 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}














