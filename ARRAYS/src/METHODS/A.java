package METHODS;

public class A {
		int a;
		String b;
		double c;
		boolean d;
		
		A(){}

		public A(int a, String b, double c, boolean d) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		
		public String toString()
		{
			return "ID:"+a+"\nName:"+b+"\nSal:"+c+"\nBool:"+d+"\n";
		}
		public boolean equals(Object obj)
		{
			A ob=(A)obj;
			return a==ob.a&&
					b.equals(ob.b)&&
					c==ob.c&&
					d==ob.d;
		}
		
		public int hashCode()
		{
			int hc=0;
			hc+=a;
			hc+=b.hashCode();
			hc+=(int)c;
			hc+=d?1:2;
			return hc;
		}
		public void hi()
		{
			System.out.println("hi");
		}
}
