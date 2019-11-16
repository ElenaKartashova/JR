package Task_8_11;
/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать только три метода.
•	Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
•	В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
•	В методе createPeopleList() должны добавляться люди с одинаковыми именами.
•	Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
•	Метод main() должен вызывать метод createPeopleList().
•	Метод main() должен вызывать метод printPeopleList().
 */
/*
Однофамильцы и тёзки
*/


import java.util.HashMap;
import java.util.Map;

public class NamesakesAndNamesakes {

    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Николай");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Николай");
        map.put("Кузнецов", "Иван");
        map.put("Голубев", "Николай");
        map.put("Иванов", "Андрей");
        map.put("Кузнецов", "Николай");
        map.put("Белов", "Сергей");
        map.put("Краснов", "Николай");
        map.put("Николаев", "Петр");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
