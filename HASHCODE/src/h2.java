class h2
{
	public static void main(String[]args)
	{
		mango m1=new mango(100);
		mango m2=m1;
		System.out.println("m1==m2"+(m1==m2));
		System.out.println("m1.hashCode()"+m1.hashCode());
		System.out.println("m2.hashCode()"+m2.hashCode());
		System.out.println("m1.hashCode()==m2.hashCode()"+(m1.hashCode()==m2.hashCode()));
		System.out.println("m1.equals(m2)"+m1.equals(m2));
	}
}


class mango
{
	int price;

	mango () {}

	mango (int price){
		this.price=price;
	}
}