package OldDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		
	
		Date d = new Date();
		System.out.println(d.toString());
		
		//mm/dd/yyyy  hh:mm:ss
		
		SimpleDateFormat format01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format02 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String date=format01.format(d);
		System.out.println(date);
		
		String date02= format02.format(d);
		System.out.println(date02);
	}
	
}
