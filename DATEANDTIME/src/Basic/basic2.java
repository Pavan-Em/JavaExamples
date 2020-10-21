package Basic;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class basic2 {
	public static void main(String[] args) {
		
		
		LocalDate tday = LocalDate.now();
		LocalDate bod = LocalDate.of(1996, 11, 06);
		Period p = Period.between(bod, tday);
		System.out.println(p.getMonths());
		System.out.println("======================");
		
		System.out.println("Check for Leap year");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = s.nextInt();
		Year y = Year.of(year);
		if(y.isLeap())
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap year");
	}
}
