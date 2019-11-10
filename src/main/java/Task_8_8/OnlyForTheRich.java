package Task_8_8;
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */
/*
Только для богачей
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OnlyForTheRich {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ivanov", 1200);
        map.put("Petrov", 550);
        map.put("Sidorov", 350);
        map.put("Kuznetsov", 500);
        map.put("Orlov", 499);
        map.put("Morozov", 850);
        map.put("Zelensky", 550);
        map.put("Timofeev", 501);
        map.put("Titova", 210);
        map.put("Demidova", 480);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Integer> pair = iterator.next();

            if (pair.getValue() < 500) {
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
