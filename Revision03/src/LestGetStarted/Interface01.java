package LestGetStarted;

public interface Interface01 {

	public static void main(String[] args) {
		System.out.println("Its a interface ");
		call();
	}
	
	public static void call()
	{
		System.out.println("Im from interface method");
	}
	private void call01()
	{
		System.out.println("Private non static method");
	}
	
	void call02();
}
