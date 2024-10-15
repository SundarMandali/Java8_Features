package date_and_time;

import java.time.LocalDateTime;

public class LocalDateTime_Test {

	public static void main(String[] args) {
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
	
		LocalDateTime parsed=LocalDateTime.parse("2024-10-14T22:05");
		System.out.println(parsed);
		
		
	}

}
