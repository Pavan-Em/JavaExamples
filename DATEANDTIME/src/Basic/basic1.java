package Basic;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class basic1 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(LocalDate.now());

		System.out.println(LocalDate.now().getDayOfMonth());

		System.out.println(LocalDate.now().getMonthValue());

		System.out.println(LocalDate.now().getYear());

		System.out.printf("%d/%d/%d", LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth(),
				LocalDate.now().getYear());

		System.out.println("\n=====================");

		LocalTime time = LocalTime.now();
		System.out.println(time);

		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());

		System.out.println("=================================");
		
		LocalDateTime  dt = LocalDateTime.now();
		System.out.println(dt);
		
		System.out.println("==================");
		
		LocalDateTime dob = LocalDateTime.of(1996, 11,06,3,30);
		System.out.println(dob);
		
		System.out.println("After 6 months : "+dob.plusMonths(6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
