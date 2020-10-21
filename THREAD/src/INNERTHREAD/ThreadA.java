package INNERTHREAD;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB t=new ThreadB();
		t.start();
		t.wait();
		System.out.println(t.total);
	}										//---->2 RTE onr from t.wait() another from this.notify() bcoz both not in Synchronized method
}

class ThreadB extends Thread
{
	int total = 0;
	public void run()
	{
		for(int i=1;i<=100;i++)
			total+=i;
		this.notify();
	}

}
