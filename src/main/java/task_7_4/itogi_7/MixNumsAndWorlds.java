package task_7_4.itogi_7;

//Ввести с клавиатуры 2 числа N и M.
//Ввести N строк и заполнить ими список.
//Переставить M первых строк в конец списка.
//Вывести список на экран, каждое значение с новой строки.
//
//Примечание: запрещено создавать больше одного списка.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//•	Переставить M первых строк в конец списка.
//•	Выведи список на экран, каждое значение с новой строки.

/*
Перестановочка подоспела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MixNumsAndWorlds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код

        ArrayList<String> worlds = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            worlds.add(s);
        }
        for (int i = 0; i < M; i++) {
            worlds.add(worlds.get(i));
        }
        for (int j = 0; j < M; j++) {
            worlds.remove(worlds.get(0));
        }
        for (int i = 0; i < worlds.size(); i++) {
            System.out.println(worlds.get(i));
        }
    }
}
