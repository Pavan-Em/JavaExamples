package THREAD1;

public class threaddemo1 {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
		System.out.println("Main Method");
		try {
		t.start();
		}
		catch(RuntimeException e)
		{
			System.out.println("Fuck You");
		}
	}
}

class MyThread1 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Start Method");
	}
	public void run()
	{
		
		System.out.println("Run Method");
	}
}
