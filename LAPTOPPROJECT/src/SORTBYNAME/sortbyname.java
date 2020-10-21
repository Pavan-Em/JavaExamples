package SORTBYNAME;

import java.util.Comparator;

import LAPTOP.laptop;

public class sortbyname implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return obj1.getProduct_name().compareToIgnoreCase(obj2.getProduct_name());
	}
}
