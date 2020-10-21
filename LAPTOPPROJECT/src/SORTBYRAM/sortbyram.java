package SORTBYRAM;

import java.util.Comparator;

import LAPTOP.laptop;

public class sortbyram implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return (int)obj1.getRam_size()-(int)obj2.getRam_size();
	}
}
