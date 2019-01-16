package testScripts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dateTime {
    public static void main(String[] args) {
        LocalDate newDate = LocalDate.of(1980, Month.JULY, 19);
        LocalTime time = LocalTime.of(14, 11);
        LocalDateTime newDateTime = LocalDateTime.of(newDate, time);
        System.out.println(newDate.toEpochDay());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(newDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        DateTimeFormatter formattedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(formattedTime.format(newDateTime));
    }
}
