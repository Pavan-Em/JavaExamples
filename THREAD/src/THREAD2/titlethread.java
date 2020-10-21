package THREAD2;

public class titlethread {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		//t1.setPriority(1);
		t1.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println("Main Thread");
		}
	}

}

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			Thread.yield();
			System.out.println("Child Thread");
		}
		
	}
}
