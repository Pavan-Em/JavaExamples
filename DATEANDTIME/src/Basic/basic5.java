package Basic;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class basic5 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek().name());
		
		System.out.println(LocalDate.of(2019, Month.JANUARY, 23 ));
		
		System.out.println(date.isLeapYear());
		
		LocalDateTime t = LocalDateTime.now();
		String tt = t.format(DateTimeFormatter.ofPattern("yyyy/mm/dd"));
		System.out.println(tt);
		"String".strip();
	}
}
