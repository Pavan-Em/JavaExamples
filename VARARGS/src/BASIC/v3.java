package BASIC;

public class v3 {
	public static void main(String[] args) {
		test(10);
	}
	
	public static void test(int ... a)
	{
		System.out.println("from int...");
	}
	
	public static void test(long a) {
	System.out.println("from long");

	}
}
