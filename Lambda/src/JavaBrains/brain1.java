package JavaBrains;

public class brain1 {
	public static void main(String[] args) {
		callGetLength(s->s.length());
	}
	
	public static void callGetLength(StringGetLength l)
	{
		System.out.println(l.getLength("Hola Mother Fucker"));
	}
	
	interface StringGetLength
	{
		int getLength(String s);
	}
}
