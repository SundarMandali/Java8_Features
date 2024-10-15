package date_and_time;

import java.time.LocalTime;

public class LocalTime_Test {

	public static void main(String[] args) {
		LocalTime current=LocalTime.now();
		System.out.println(current);
		
		System.out.println(current.getHour());
		System.out.println(current.getMinute());
		System.out.println(current.getSecond());
		System.out.println(current.getNano());
		
		LocalTime customTime=LocalTime.of(3, 10,25);
		System.out.println(customTime);
		
		LocalTime prev=current.minusHours(1);
		System.out.println(prev);
		
		if(prev.isBefore(current))
			System.out.println("Yes");
		
		LocalTime parsedTime=LocalTime.parse("21:47:12");
		System.out.println(parsedTime);	
	}

}
