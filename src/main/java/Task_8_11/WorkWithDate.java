package Task_8_11;

import java.util.*;
import java.text.*;

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать два метода.
•	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
•	Метод main() должен вызывать метод isDateOdd().
 */
/*
Работа с датой
*/
public class WorkWithDate {
    public static void main(String[] args) {
        System.out.println(isDateOdd("DECEMBER 26 2019"));
        System.out.println(" = " );

    }

    public static boolean isDateOdd(String date) {
        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY, 1);
        calendar.set(Calendar.HOUR, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        //Calendar calendar1 = new GregorianCalendar(2019, Calendar.DECEMBER, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        dateFormat.getCalendar();

      //  System.out.println(dateFormat.format(calendar.getTime()));
        Date dateToday = new Date();
        Date dateCal = calendar.getTime();
        if ((dateToday.getTime() - dateCal.getTime() / 86400000) % 2 == 0) {
            return false;
        } else
            return true;
    }
}
