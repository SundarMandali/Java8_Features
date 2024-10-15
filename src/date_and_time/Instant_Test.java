package date_and_time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instant_Test {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println(time);
		//instant time will be in UTC
		Instant currentInstant=Instant.now();
		System.out.println(currentInstant);
		//convert instant time to ur timezone's time
		ZonedDateTime zid=currentInstant.atZone(ZoneId.systemDefault());
		System.out.println(zid);
	}

}
