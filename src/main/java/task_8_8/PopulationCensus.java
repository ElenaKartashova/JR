package task_8_8;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Перепись населения
*/
public class PopulationCensus {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Петр");
        map.put("Кукушкина", "Раиса");
        map.put("Пичугина", " Ирина");
        map.put("Лермонтова", "Александра");
        map.put("Кузнецова", "Елена");
        map.put("Александрова", "Елена");
        map.put("Иванова", "Наталья");
        map.put("Пушкин", "Александр");
        map.put("Лапушкина", "Наталья");
        map.put("Рассказова", "Наталья");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int firstName = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) {
                firstName++;
            }
        }
        return firstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int lastN = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) {
                lastN++;
            }
        }
        return lastN;
    }

    public static void main(String[] args) {
      Map<String, String> map = new HashMap<String, String>();

        map.put("Иванов", "Петр");
        map.put("Кукушкина", "Раиса");
        map.put("Пичугина", " Ирина");
        map.put("Лермонтова", "Александра");
        map.put("Кузнецова", "Елена");
        map.put("Александрова", "Елена");
        map.put("Иванова", "Наталья");
        map.put("Пушкин", "Александр");
        map.put("Лапушкина", "Наталья");
        map.put("Рассказова", "Наталья");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();

            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
