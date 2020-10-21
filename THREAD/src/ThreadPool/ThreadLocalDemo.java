package ThreadPool;

import java.util.concurrent.ExecutorService;

public class ThreadLocalDemo {
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("pavan");
		CustomerThread c2 = new CustomerThread("Deeka");
		CustomerThread c3 = new CustomerThread("Kera");
		CustomerThread c4 = new CustomerThread("Jordi");
		CustomerThread c5 = new CustomerThread("Pavi");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
	}
}

class CustomerThread extends Thread
{
	static Integer custID=0;
	private static ThreadLocal<Integer> t = new ThreadLocal<>()
			{
				protected Integer initialValue()
				{
					return ++custID;
				}
			};
	CustomerThread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ID-NO : "+t.get());
	}
}
