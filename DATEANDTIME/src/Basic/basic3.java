package Basic;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class basic3 {
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		System.out.println("=================");
		
		ZoneId z = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(z);
		System.out.println(zt);
	}
}
