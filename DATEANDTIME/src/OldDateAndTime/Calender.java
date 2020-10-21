package OldDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(format.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}
}
