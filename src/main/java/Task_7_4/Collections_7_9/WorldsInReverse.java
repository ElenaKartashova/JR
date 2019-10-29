package Task_7_4.Collections_7_9;
//Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
//
//Требования:
//•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//•	Считай 5 строк с клавиатуры и добавь их в список.
//•	Удали третий элемент списка.
//•	Выведи элементы на экран, каждый с новой строки.
//•	Порядок вывода должен быть обратный.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке
*/
public class WorldsInReverse {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> worlds = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            worlds.add(s);
        }
        worlds.remove(2);
        for (int j = worlds.size() - 1; j >= 0; j--) {
            System.out.println(worlds.get(j));
        }
    }
}
