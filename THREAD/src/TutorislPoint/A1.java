package TutorislPoint;

public class A1 {
	public static void main(String[] args) {
		System.out.println(Thread.holdsLock(new A1()));
		System.out.println(Thread.currentThread());
		try
		{
		Thread.dumpStack();
		} catch (Exception e) {
			System.out.println("got u");
		}
		System.out.println("i didnt get");
	}
}
