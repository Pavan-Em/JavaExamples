package LAPTOP;
import java.util.Comparator;
public class sortbyeid implements Comparator{
	public int compare(Object a,Object b)
	{
		laptop obj1=(laptop)a;
		laptop obj2=(laptop)b;
		return obj1.pid-obj2.pid;
	}
	}
