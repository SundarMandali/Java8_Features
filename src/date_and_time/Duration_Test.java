package date_and_time;

import java.time.Duration;
import java.time.Instant;

public class Duration_Test {

	public static void main(String[] args) {
		//Duration is the diff between two times
		Instant start=Instant.now();

		for(int i=0;i<1000000000;i++)
		{
			
		}
		Instant end=Instant.now();
		Duration duration=Duration.between(start, end);
		System.out.println(duration);
		
	}

}
