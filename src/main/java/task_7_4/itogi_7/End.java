package task_7_4.itogi_7;

//Создать список строк.
//Ввести строки с клавиатуры и добавить их в список.
//Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
//Вывести строки на экран, каждую с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
//•	Саму строку "end" не нужно добавлять в список.
//•	Выведи список на экран, каждое значение с новой строки.
//•	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/
public class End {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        String w = "end";
        int count = 0;
        while (true) {
            String s = reader.readLine();
            strings.add(s);
            count++;

            if (s.equals(w))
                break;
        }
        strings.remove(strings.get(strings.size() - 1)); //удаляю из списка end
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}







