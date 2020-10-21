package drive;
import B.B;
import A.A;
class drive
{
	public static void main(String[]args)
	{
		//B b1=(B)new A();//bcoz of this oly i import A.A
		System.out.println("A super B sub i from A :"+B.i);//no need to import A to use here bcoz A is inherited to B
		System.out.println("j from B sub  :"+B.j);
	}
}