package LAPTOP;

import java.util.Comparator;

public class sortbyname implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return obj1.name.compareTo(obj2.name);
	}
}
