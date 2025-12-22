package miscellaneous;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime());

        System.out.println("\nFormatting");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));


        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMM d, hh:mm")));
        System.out.println(dateTime.getHour());
    }
}
