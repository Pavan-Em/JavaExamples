package SYNCHRONIZATION;

public class syncDemo2 {
	public static void main(String[] args) {
		Display1 d=new Display1();
		MyThread1 t1=new MyThread1(d);
		MyThared2 t2=new MyThared2(d);
		t1.start();
		t2.start();
	}
}

class Display1
{
	public synchronized void displaynum()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
	}
	public synchronized void displaychar()
	{
		for(int i=65;i<75;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
	}
}
class MyThread1 extends Thread
{
	Display1 d;
	public MyThread1(Display1 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displaynum();
	}
}
class MyThared2 extends Thread
{
	Display1 d;
	public MyThared2(Display1 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displaychar();
	}
}
