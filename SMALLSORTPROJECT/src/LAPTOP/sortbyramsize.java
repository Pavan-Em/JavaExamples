package LAPTOP;

import java.util.Comparator;

public class sortbyramsize implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return (int)obj1.rsize-(int)obj2.rsize;
	}
}
