package Basic;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class basic4 {
	public static void main(String[] args) {
		
		String date = LocalDate.parse("2019-11-06").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		
		LocalDate date1 = LocalDate.parse("2015-02-12",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
	}
}
