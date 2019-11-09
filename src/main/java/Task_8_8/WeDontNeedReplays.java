package Task_8_8;
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */

/*
Нам повторы не нужны
*/

import java.util.*;

public class WeDontNeedReplays {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванова", "Лена");
        map.put("Петрова", "Маша");
        map.put("Сидорова", "Катя");
        map.put("Кузнецов", "Саша");
        map.put("Карпов", "Коля");
        map.put("Нестерова", "Лена");
        map.put("Белова", "Катя");
        map.put("Миронова", "Вера");
        map.put("Александрова", "Вера");
        map.put("Комарова", "Зоя");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> name = new ArrayList<String>();
       /* for (Map.Entry<String, String> pair : map.entrySet()) {
            name.add(pair.getValue());
        } */
        Iterator<HashMap.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, String> pair = it.next();
            String value = pair.getValue();
            name.add(value);
        }

        for (int j = 0; j < name.size(); j++) {
            String name1 = name.get(j);
            for (int k = j + 1; k < name.size(); k++) {
                if (name1.equals(name.get(k))) removeItemFromMapByValue(map, name.get(k));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(createMap());
    }
}
