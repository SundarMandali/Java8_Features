package date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class Period_Test {

	public static void main(String[] args) {
		//Period is used for diff between two dates
		LocalDate now=LocalDate.now();
		LocalDate customDate=LocalDate.of(2024, 5, 31);
		Period period=Period.between(now, customDate);
		System.out.println(period);
	}

}
