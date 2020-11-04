package task_8_8;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/
public class ZinaidaAndSummerHoliday {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, java.util.Date>();
        map.put("Рен", dateFormat.parse("January 12 2967"));

        //напишите тут ваш код
        map.put("Лид", dateFormat.parse("June 21 1950"));
        map.put("Лен", dateFormat.parse("February 14 1981"));
        map.put("Нат", dateFormat.parse("December 21 1969"));
        map.put("Нин", dateFormat.parse("April 17 1945"));
        map.put("Зем", dateFormat.parse("August 26 1976"));
        map.put("Мад", dateFormat.parse("August 16 1958"));
        map.put("Майк", dateFormat.parse("August 29 1958"));
        map.put("Фред", dateFormat.parse("September 5 1946"));
        map.put("Джо", dateFormat.parse("June 25 1963"));
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        GregorianCalendar calendar = new GregorianCalendar(); // создаем экземпляр календаря
        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Date> entry = iterator.next();
            calendar.setTime(entry.getValue()); // записываем дату в календарь
            if (calendar.get(Calendar.MONTH) > 4 && calendar.get(Calendar.MONTH) < 8) // проверяем месяц
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
