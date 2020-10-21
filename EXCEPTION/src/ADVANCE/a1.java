package ADVANCE;

public class a1 {
	public static void main(String[] args) throws Exception {
		throw new TooYoung("my Exception");
		
	}
}

class TooYoung extends Exception
{
	public TooYoung(String st)
	{
		super(st);
	}
}
