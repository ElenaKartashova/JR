package Task_7_4;

//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
//
//Требования:
//•	Инициализируй существующее поле strings класса Solution новым ArrayList<>
//•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
//•	Программа должна выводить самую длинную строку на экран.
//•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//import java.util.Collections.max;

public class LongString {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        //цикл сравнения цначения с предыдущим
        int largestString = strings.get(0).length();
        int index = 0;
        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() > largestString) {
                largestString = strings.get(j).length();
                index = j;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == largestString) {
                System.out.println(strings.get(i));
            }
        }
    }
}



















