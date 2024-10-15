package date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Test {

    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = current.format(df);
        System.out.println(format);
        
        String date="14/10/2024";
        LocalDate parsedDate=LocalDate.parse(date,df);
        System.out.println(parsedDate);
        
        //same with other classes
    }
}
