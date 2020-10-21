package THREAD1;

public class nameThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main
		MyNameThread t=new MyNameThread();
		t.start();
		System.out.println(t.getName());
		MyNameThread t2=new MyNameThread();
		t2.start();
		System.out.println(t2.getName());
		Thread.currentThread().setName("Pavan");
		System.out.println(Thread.currentThread().getName());
		t.setName("Tools");
		System.out.println(t.getName());
		//System.out.println(10/0);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
	}
}

class MyNameThread extends Thread
{
	public void run()
	{
		System.out.println("Run Method : "+Thread.currentThread().getName());
	}
}
