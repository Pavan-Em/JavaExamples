package DURGA;

public class d5 {
		public static void main(String[] args) {
					
			Integer num1=new Integer(10);
			Integer num2=new Integer(10);
			System.out.println(num1==num2);
			System.out.println(System.identityHashCode(num1));
			System.out.println(System.identityHashCode(num2));
			
			Integer num3=10;
			System.out.println(num1==num3);
			System.out.println(System.identityHashCode(num3));
			
			Integer num4=10;
			System.out.println(num3==num4);
			System.out.println(System.identityHashCode(num4));
			
			Integer x1=100;
			Integer y1=100;
			System.out.println(x1==y1);
			System.out.println(System.identityHashCode(x1));
			System.out.println(System.identityHashCode(y1));
			
			Integer x=1000;
			Integer y=1000;
			System.out.println(x==y);
			System.out.println(System.identityHashCode(x));
			System.out.println(System.identityHashCode(y));
			
			Integer x2=200;
			Integer y2=200;
			System.out.println(x2==y);
			
			Integer x3=128;
			Integer y3=128;
			System.out.println(x3==y3);
			
			System.out.println("=======================");
			
			Byte b=10;
			Byte b2=10;
			System.out.println(b==b2);
			System.out.println(System.identityHashCode(b2));
			System.out.println(System.identityHashCode(b2));
			
			Double d=10.0;
			Double d1=10.0;
			System.out.println(d==d1);
			
			
			Integer i1=Integer.valueOf(10);
			Integer i2=Integer.valueOf(10);
			System.out.println(i1==i2);
			
			Integer i3=10;
			System.out.println(i3==i1);
		}
}
