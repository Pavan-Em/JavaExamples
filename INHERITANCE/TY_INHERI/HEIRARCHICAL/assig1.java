class A
{
	int i=1;
}
class B extends A
{
	int j=2;
}
class C extends A
{
	int k=3;
}
class D extends A
{
	int l=4;
}
class E extends D
{
	int m=5;
}
class assig1
{
	public static void main(String[]args)
	{
		B objb=new B();
		System.out.println(objb.i);
		System.out.println(objb.j);
		C objc=new C();
		System.out.println(objc.i);
		System.out.println(objc.k);
		D objd=new D();
		System.out.println(objd.i);
		System.out.println(objd.l);
		E obje=new E();
		System.out.println(obje.i);
		System.out.println(obje.l);
		System.out.println(obje.m);
	}
}