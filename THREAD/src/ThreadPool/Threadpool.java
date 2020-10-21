package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
	public static void main(String[] args) {
		MyRunnable[] jobs = { new MyRunnable("pavan"),new MyRunnable("Kera"),new MyRunnable("pavi"),new MyRunnable("Jordi"),new MyRunnable("Deeka")};
		ExecutorService service = Executors.newFixedThreadPool(1);
		for(MyRunnable job : jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}

class MyRunnable implements Runnable
{
	String name;
	MyRunnable(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println(name+" is Started by Thread "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {}
		System.out.println(name+" is completed by Thread "+Thread.currentThread().getName());
	}
}
