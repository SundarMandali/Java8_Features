package date_and_time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Test {

	public static void main(String[] args) {
		LocalDate current=LocalDate.now();
		System.out.println(current);
		System.out.println();
		
		LocalDate customDate=LocalDate.of(2024, 05,31);
		System.out.println(customDate);
		System.out.println();
		
		LocalDate customDate2=LocalDate.of(2024, Month.MAY,31);
		System.out.println(customDate2);
		System.out.println();
		
		System.out.println(current.getDayOfMonth());
		System.out.println(current.getDayOfWeek());
		System.out.println(current.getYear());
		System.out.println(current.getMonth());
		System.out.println();
		
		LocalDate yesterday=current.minusDays(1);
		System.out.println(yesterday);
		if(current.isAfter(yesterday)) {
			System.out.println("Yes");
		}
		
	}

}
