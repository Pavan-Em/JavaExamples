package BASIC;

public class v2 {
	public static void main(String[] args) {
		
		test();//ambiguevity
		
	}
	
	public static void test(int... a)
	{
		System.out.println("From int...");
	}
	
	public static void test(int a,int... b)
	{
		System.out.println("from int,int...");
	}
	

}
