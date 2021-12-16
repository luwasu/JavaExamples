package dateAndCalandar;

/*

       - The Date Class
            The Date class represents a specific instance in time.

       - The Calendar Class
            The Calendar class is an abstract class that provides methods for manipulating date and time.

        Java has some other classes that can be used to manipulate dates. These won't be needed for this course, but if you're curious, you can read about them in the official documentation here.

        - LocalDate
        - LocalTime
        - LocalDateTime
*/

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarExample {

    public static void main(String[] args) {
        displayCurrentDate();
        displaySetDate();
    }

    private static void displayCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new java.util.Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    private static void displaySetDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 02, 02);
        Date date = calendar.getTime();

        System.out.println(date);
    }
}
