class A
{
   int i=10;
}
class B extends A
{
  static int i=33;
}

class demo1
{
	static int i=99;
	public static void main(String[]args)
	{
		B obj=new B();
		System.out.println(obj.i);
	}

}
/*compiler search i inside obj of B which has instance of A and B 
 thn search in static area of B thn in static area of A if i is not 
 present in anywhere itll give comile time error and dont print i
 presnt inside demo1*/