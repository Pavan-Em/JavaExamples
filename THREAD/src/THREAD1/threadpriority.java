package THREAD1;

public class threadpriority {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(1);
		MyPriority t=new MyPriority();
		t.start();
		t.setPriority(10);
		for(int i=0;i<10;i++)
		{
			System.out.println("Main THread");
		}
		
	}
}

class MyPriority extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Chile Thread");
		}
	}
}
