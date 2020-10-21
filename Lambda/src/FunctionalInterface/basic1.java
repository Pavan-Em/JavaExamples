package FunctionalInterface;

public class basic1 {

	public static void main(String[] args) {
		
		
		Intface i = ()-> System.out.println("Hello from Labda Expression");
		System.out.println("Hello world");
		i.m1();
		
		square s = (a,b)->a*b;
		System.out.println(s.squareIt(10, 20));
		//System.out.println(s.squareIt("as", "65"));  //-->Not possible
		}
	}

	interface Intface
	{
		public void m1();
	}
	
	interface square
	{
		public int squareIt(int a,int b);
	}

