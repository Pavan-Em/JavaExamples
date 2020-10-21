package SORTBYID;

import java.util.Comparator;

import LAPTOP.laptop;

public class sortbyid implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return obj1.getProduct_id()-obj1.getProduct_id();
	}
}
