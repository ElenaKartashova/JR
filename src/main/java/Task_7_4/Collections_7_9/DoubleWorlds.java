package Task_7_4.Collections_7_9;

//1. Введи с клавиатуры 10 слов в список строк.
//
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//3. Выведи результат на экран, каждое значение с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай 10 строк с клавиатуры и добавь их в список.
//•	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
//•	Выведи получившийся список на экран, каждый элемент с новой строки.

/*
Удваиваем слова
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleWorlds {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            String world = reader.readLine();
            list.add(world);
        }
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (String W : result)
            System.out.println(W);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> worlds = new ArrayList<String>();
        for (String world : list) {
            worlds.add(world);
            worlds.add(world);
        }
        return worlds;
    }
}
