package Task_8_8;

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
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
Добрая Зинаида и летние каникулы
*/
public class ZinaidaAndSummerHoliday {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, java.util.Date>();
        map.put("Рената", dateFormat.parse("January 12 2967"));

        //напишите тут ваш код
        map.put("Лидочка", dateFormat.parse("June 21 1950"));
        map.put("Леночка", dateFormat.parse("February 14 1981"));
        map.put("Наташа", dateFormat.parse("December 21 1969"));
        map.put("Нина", dateFormat.parse("April 17 1945"));
        map.put("Земфира", dateFormat.parse("August 26 1976"));
        map.put("Мадонна", dateFormat.parse("August 16 1958"));
        map.put("Майкл", dateFormat.parse("August 29 1958"));
        map.put("Фреди", dateFormat.parse("September 5 1946"));
        map.put("Джордж", dateFormat.parse("June 25 1963"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();

        }
    }

    public static void main(String[] args) {

    }
}
