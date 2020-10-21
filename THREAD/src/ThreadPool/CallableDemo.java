package ThreadPool;
import java.util.concurrent.*;
public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = { new MyCallable(10),new MyCallable(20),new MyCallable(30),new MyCallable(40),new MyCallable(50),new MyCallable(60)};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job : jobs)
		{
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}

class MyCallable implements Callable
{
	int num;
	MyCallable(int num)
	{
		this.num=num;
	}
	public Object call() throws Exception
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("See Man");
		Thread.sleep(2000);
		return sum;
	}
}
