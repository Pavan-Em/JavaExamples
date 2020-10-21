package BASIC1;

public class special2 {

	public static void main(String[] args) {
		System.out.println(level.LOW);
		if("LOW"==level.LOW.toString())
			System.out.println("got it");
		
		System.out.println(level.LOW.compareTo(level.HIGH));
		level low=level.valueOf("LOW");
		//level medium=level.valueOf("lopper");
	}

}

enum level
{
	LOW,MEDIUM,HIGH;
}
