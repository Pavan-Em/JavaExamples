package DURGA;
import java.util.*;
public class d2 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(10);
		l.add(6);
		l.add(2);
		l.add(95);
		l.add(6);
		l.add(1);
		for(Object x:l)
		{
			System.out.println(x);
		}
		
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Element");
		Object m=s.next();
		//s.nextLine();
		for(Object x:l)
		{
			//System.out.print(x+"-->");
			if(m.equals(x))
			{
				System.out.println(l.indexOf(x));
				break;
			}
		}
		Object o1=95;
		Object o2=95;
		Object o3="95";
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o1.equals(o2));
		
	}
}
