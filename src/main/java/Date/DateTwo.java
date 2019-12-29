package Date;

import java.util.GregorianCalendar;
import  java.util.Calendar;
import java.util.Date;

public class DateTwo {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2019, 0, 1);
        Date date = calendar.getTime();

        System.out.println(date);
        System.out.println(date.getTime());

        Date dateToday = new Date();
        System.out.println(dateToday.getTime());

        System.out.println(((dateToday.getTime() - date.getTime())/86400000) + 1);
    }
}
