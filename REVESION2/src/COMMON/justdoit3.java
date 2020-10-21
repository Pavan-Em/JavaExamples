package COMMON;

public class justdoit3 {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(A.i);
		System.out.println(Double.valueOf(45.26).hashCode());
		System.out.println(Double.valueOf(45.26).hashCode());
	}
}

class A extends B
{
	static int i=6;
}

class B
{
	 int i=66;
}
