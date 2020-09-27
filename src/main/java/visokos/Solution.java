package visokos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if ((a % 400 == 0) || (a % 100 == 0) || (a % 4 == 0)) {
            System.out.println("количество дней в году: 366");
        } else
            System.out.println("количество дней в году: 365");



        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
        System.out.println("Порядковый номер недели в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));//порядковый номер недели в месяце

        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
        System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
        System.out.println("Миллисекунды: " + calendar.get(Calendar.MILLISECOND));


        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar2 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(calendar2.HOUR, 10);
        calendar.set(calendar2.MINUTE, 42);
        calendar.set(calendar2.SECOND, 12);

        calendar2.roll(calendar2.MONTH, -2);
        System.out.println(dateFormat.format(calendar2.getTime()));

    }

}

