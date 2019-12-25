package Task_8_11;

import java.util.Date;

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
        System.out.println(isDateOdd("MAY 1 2013"));

        //Date date = new Date(1212121212121L);
        //System.out.println(date);

        Date date = new Date();
        System.out.println(date);
    }

    public static boolean isDateOdd(String date) {
       // if (date );
        return true;
    }
}
