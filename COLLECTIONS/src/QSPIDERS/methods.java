package QSPIDERS;
import java.util.*;
public class methods {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	System.out.println("ArrayList:"+l1);
	System.out.println("Size:"+l1.size());
	l1.add(1,30);
	System.out.println("ArrayList:"+l1);
	System.out.println("Size:"+l1.size());
	System.out.println("===============================");
	ArrayList l2=new ArrayList();
	l2.add(100);
	l2.add(200);
	l2.add(300);
	System.out.println("ArrayList:"+l2);
	System.out.println("Size:"+l2.size());
	System.out.println("===============================");
	System.out.println("Example for add()");
	l1.add(l2);
	System.out.println(l1);
	System.out.println("Size l1:"+l1.size());
	System.out.println(l2);
	System.out.println("Size l2:"+l2.size());
	System.out.println("===============================");
	System.out.println("Example for addAll(coll)");
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println("Size l1:"+l1.size());
	System.out.println(l2);
	System.out.println("Size l2:"+l2.size());
	System.out.println("================================");
	System.out.println("Example for add(int,obj)");
	l1.add(1,l2);
	System.out.println(l1);
	System.out.println("Size l1:"+l1.size());
	System.out.println(l2);
	System.out.println("Size l2:"+l2.size());
	System.out.println("Example for addAll(int,obj)");
	System.out.println("===================================");
	l1.addAll(1,l2);
	System.out.println("Example for addAll(int,col");
	System.out.println(l1);
	System.out.println("Size l1:"+l1.size());
	System.out.println(l2);
	System.out.println("Size l2:"+l2.size());
	System.out.println("===================================");
	ArrayList l3=new ArrayList(l2);
	l3.add(10);
	System.out.println(l3);
	System.out.println("=====================================");
	for(Object x:l1)
	{
		System.out.println(x);
	}
}
}
