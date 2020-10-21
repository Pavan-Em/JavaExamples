package BASIC;

public class m2 {
	public static void main(String[] args) {
		test(10);
		
		int[]  a= {1,2,3};
		Integer b=Integer.MAX_VALUE;
		System.out.println(b);
	}
	
	public static void test(int num)//first preference for int
	{
		System.out.println("from naked int");
	}
	public static void test(Integer num)
	{
		System.out.println("from wrapeed int");
	}
}
