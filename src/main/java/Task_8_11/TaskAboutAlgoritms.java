package Task_8_11;

import java.util.*;

/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать три метода.
•	Метод main() должен вызывать метод sort().
•	Метод sort() должен вызывать метод isGreaterThan().
•	Выведенные слова должны быть отсортированы в алфавитном порядке.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам
*/
public class TaskAboutAlgoritms {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (isGreaterThan(array[i], array[k])) {
                    String str = array[i];
                    array[i] = array[k];
                    array[k] = str;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
