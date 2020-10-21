package THREAD1;

public class Runnabledemo1 {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Main Method");
		Thread t1=new Thread();
		t1.start();
		System.out.println("Main Method");
		Thread t2=new Thread(r);
		t2.start();
		System.out.println("Main Method");
		
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Runnable run method");
	}
}
