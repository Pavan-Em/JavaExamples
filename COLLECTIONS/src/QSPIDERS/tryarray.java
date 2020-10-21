package QSPIDERS;
import java.util.*;
public class tryarray {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		int[] num= {1,2,3};
		a.add(Arrays.toString(num));
		System.out.println(a);
		for(int i=num.length-1;i>=0;i--)
		a.add(0,num[i]);
		System.out.println(a);
		
		System.out.println("========================");
		
		ArrayList s=new ArrayList();
		s.add("pavan");
		s.add("kera");
		System.out.println(s);
		String[] ss= {"pavi","jordan"};
		s.add(Arrays.toString(ss));
		System.out.println(s);
		for(int i=0;i<ss.length;i++)
		{
			s.add(ss[i]);
		}
		System.out.println(s);
	}
}
