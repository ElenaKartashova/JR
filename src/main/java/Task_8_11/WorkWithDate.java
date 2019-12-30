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
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("JANUARY 2 2019"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Calendar calendar = new GregorianCalendar();

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date start = format.parse(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date dateToday = new Date();

        System.out.print(date + " = ");

        if ((((dateToday.getTime() - start.getTime()) / 86400000) + 1) % 2 != 0) {
            return true;
        } else
            return false;
    }
}

//Решение
/*  Date date1 = new Date(Date.parse(date));
        SimpleDateFormat day = new SimpleDateFormat("D");
        int n = Integer.parseInt(day.format(date1));

        if (n % 2 == 0){
            return false;
        }
        else {
        return true;
        }
    }*/