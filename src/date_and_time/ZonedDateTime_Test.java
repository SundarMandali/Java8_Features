package date_and_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime_Test {

	public static void main(String[] args) {
		ZonedDateTime current=ZonedDateTime.now();
		System.out.println(current);
		System.out.println(current.getChronology());
		System.out.println(current.getZone());
		System.out.println();
		Set<String> zoneIds=ZoneId.getAvailableZoneIds();
		zoneIds.forEach(System.out::println);
		ZonedDateTime customZID=ZonedDateTime.of(2024, 5,21 , 3, 30, 50, 20,ZoneId.of("Asia/Calcutta"));
		System.out.println(customZID);
		
		ZonedDateTime indianTime=ZonedDateTime.now(ZoneId.of("Asia/Calcutta")); 
		System.out.println(indianTime);
		ZonedDateTime newyorkTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyorkTime);
	}

}
