package Task_8_11;
/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
•	Программа должна считывать одно значение с клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна использовать коллекции.
•	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

/*
Номер месяца
*/
public class NumberOfMonth {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();

        Map<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        Iterator<HashMap.Entry<Integer, String>> iterator = months.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> pair = iterator.next();
            if (month.equals(pair.getValue()))
                System.out.println(month + " is the " + pair.getKey() + " month ");
        }
    }
}
