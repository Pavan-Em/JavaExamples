package FunctionalInterface;
@FunctionalInterface
public interface Funinterface {
	public void m2();
	default void m3()
	{
		System.out.println("Default method");
	}
	public static void m4()
	{
		
	}
}
