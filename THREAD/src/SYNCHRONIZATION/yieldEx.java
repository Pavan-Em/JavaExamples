package SYNCHRONIZATION;

public class yieldEx {
	public static void main(String[] args) {
		myyield t=new myyield();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
			Thread.yield();
		}
	}
}

class myyield extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Theread");
			Thread.yield();
		}
	}
}
