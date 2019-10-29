package Task_7_4;

//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 5 строк с клавиатуры.
//•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//•	Программа должна выводить список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/
public class RemoveAndInsertString {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> RemIns = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            RemIns.add(s);
        }
        for (int i = 0; i < 13; i++) {
            RemIns.add(0, RemIns.remove(4));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(RemIns.get(i));
        }
    }
}
