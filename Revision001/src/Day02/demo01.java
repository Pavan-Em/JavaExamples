package Day02;

public class demo01 {

	public static void main(String[] args) {
		
		double d = 2.03;
		System.out.println(((Double)d).hashCode());
		System.out.println(System.identityHashCode((Double)d));
		
		System.out.println("pavan a".toUpperCase());
		
		System.out.println("Pavan".substring(1, 20));
	}
}
