package SORTBYPRICE;

import java.util.Comparator;

import LAPTOP.laptop;

public class sortbyprice implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return (int)obj1.getProduct_price()-(int)obj2.getProduct_price();
	}
}
