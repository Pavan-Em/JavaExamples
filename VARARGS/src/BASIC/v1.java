package BASIC;

public class v1 {
	public static void main(String[] args) {
		
		test();
		test(new v1());
		test(new v1(),new v1());
		
	}
	
	public static void test(v1... obj)
	{
		System.out.println("possible");
	}
}
