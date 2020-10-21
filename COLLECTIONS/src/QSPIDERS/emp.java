package QSPIDERS;
import java.util.*;
public class emp {
	int id;
	String name;
	
	emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		ArrayList e=new ArrayList();
		emp e1=new emp(1,"pavan");
		emp e2=new emp(2,"Dixit");
		emp e3=new emp(3,"Smith");
		e.add(e1);
		e.add(e2);
		e.add(e3);
		System.out.println(e);
		ArrayList ee=new ArrayList();
		emp e4=new emp(1,"ker");
		emp e5=new emp(2,"foojui");
		ee.add(e4);
		ee.add(e5);
		System.out.println(ee);
		e.addAll(ee);
		System.out.println(e);
		emp[] eee=new emp[2];
		eee[0]=new emp(1,"Danny");
		eee[1]=new emp(2,"jordan");
		System.out.println(Arrays.toString(eee));
		ee.add(Arrays.toString(eee));
		System.out.println(ee);
		for(int i=0;i<eee.length;i++)
		{
			ee.add(eee[i]);
		}
		System.out.println(ee);
		
		System.out.println(e);
		
		for(int i=0;i<e.size();i++)
		{
			System.out.println("RollNum:"+((emp)e.get(i)).id);
		}
		
	}
	
	public String toString()
	{
		return  id +"-"+ name;
	}

}
