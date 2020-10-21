package TutorislPoint;

public class A2 {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}

class MyThread1 extends Thread
{
	public void run()
	{
		synchronized(A2.Lock1)
		{
			System.out.println("Yes Got Lock1 from MyThread-1");
		}
		synchronized(A2.Lock2)
		{
			System.out.println("yes got Lock2 from MyThread-1");
		}
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		synchronized(A2.Lock1)
		{
			System.out.println("Yes Got Lock1 from MyThread-2");
		}
		synchronized(A2.Lock2)
		{
			System.out.println("yes got Lock2 from MyThread-2");
		}
	}
}
