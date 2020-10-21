package employee;

class user
{
	public static void main(String[]args)
	{
		te e1=new te(1,"PAVAN",62000,false);
		te e2=new te(1,"PAVAN",62000,false);
		dev e3=new dev(1,"JORDAN",90000,true);
		dev e4=new dev(2,"FOOJU",40000,false);
		System.out.println(e1);
		System.out.println("=====================================");
		System.out.println(e2);
		System.out.println("=====================================");
		System.out.println(e3);
		System.out.println("=====================================");
		System.out.println(e4);
		System.out.println("=====================================");
		System.out.println("e1.hashCode()                : "+e1.hashCode());
		System.out.println("e2.hashCode()                : "+e2.hashCode());
		System.out.println("e1.equals(e2)                : "+e1.equals(e2));
		System.out.println("e1.hashCode()==e2.hashCode() : "+(e1.hashCode()==e2.hashCode()));
	}
}