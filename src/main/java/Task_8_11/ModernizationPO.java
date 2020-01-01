package Task_8_11;
/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна вывести фамилию семьи по введенному городу.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
Модернизация ПО
*/
public class ModernizationPO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();

        while (true) {
            String cityName = reader.readLine();
            if (cityName.isEmpty()) {
                break;
            }
            String familyName = reader.readLine();
            map.put(cityName, familyName);
        }

        String city = reader.readLine();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            // for (Map.Entry<String, String> pair : map.entrySet()) {
            if (city.equals(pair.getKey()))
                System.out.println(pair.getValue());
        }
    }
}

