package Deadlock;

public class DeadLock extends Thread {
	ThreadA a = new ThreadA();
	ThreadB b = new ThreadB();

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.child();
	}

	public void child() {
		this.start();
		b.first(a);
	}

	public void run() {
		a.first(b);
	}

}

class ThreadA {
	public synchronized void first(ThreadB b) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("From ThreadA first()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("From ThreadA last()");
	}
}

class ThreadB {
	public synchronized void first(ThreadA a) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("From ThreadB first()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("From ThreadB last()");
	}
}
