
import java.util.Scanner;

class checking
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String a,b,c,d,e;
		System.out.println("String a:");
		a=s.next();
		System.out.println("String b:");
		b=s.next();
		System.out.println("lineString c:");
		c=s.nextLine();
		System.out.println("lineString d:");
		d=s.nextLine();
		System.out.println("linrstring e:");
		e=s.nextLine();

		String resstring=a+b;
		System.out.println("resstring:"+resstring);
		String reslinestring=a+e;
		System.out.println("reslinestring:"+reslinestring);

		int i,j;
		System.out.println("int i:");
		i=s.nextInt();
		System.out.println("int j:");
		j=s.nextInt();

		double x,y;
		System.out.println("double x:");
		x=s.nextDouble();
		System.out.println("double y:");
		y=s.nextDouble();

		String resint=i+a;
		System.out.println("resint:"+resint);
		String reslineint=j+d;
		System.out.println("reslinrint:"+reslineint);
		String resdouble=x+a;
		System.out.println("resdouble:"+resdouble);
		String reslinedouble=x+e;
		System.out.println("reslinrdouble:"+reslinedouble);


	}

}