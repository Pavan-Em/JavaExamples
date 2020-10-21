package RANDOM;

public class r8 {

	public static void main(String[] args) {
		final int i=10;
		StringBuffer obj=new StringBuffer("hey");
		obj.append(" pavan");
		System.out.println(obj);
		System.out.println(System.identityHashCode(obj));
		obj=new StringBuffer("oh ho");
		System.out.println(obj);
		System.out.println(System.identityHashCode(obj));

	}

}
