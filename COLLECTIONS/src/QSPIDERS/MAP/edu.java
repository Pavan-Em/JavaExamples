package QSPIDERS.MAP;

public class edu {
	public static void main(String[] ak) {
		if(ak.length==1 | ak[1].equals("test"))//leads to AIOOBE
			System.out.println(true);
		else
			System.out.println(false);
	}
}
