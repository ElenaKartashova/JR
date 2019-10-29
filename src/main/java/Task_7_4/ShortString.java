package Task_7_4;
//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую короткую строку в списке.
//4. Выведи найденную строку на экран.
//5. Если таких строк несколько, выведи каждую с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
//•	Программа должна выводить самую короткую строку на экран.
//•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortString {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> fiveStrings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            fiveStrings.add(s);
        }
        int shortestString = fiveStrings.get(0).length();

        for (int j = 0; j < fiveStrings.size(); j++) {
            if (fiveStrings.get(j).length() < shortestString) {
                shortestString = fiveStrings.get(j).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (fiveStrings.get(i).length() == shortestString) {
                System.out.println(fiveStrings.get(i));
            }
        }
    }
}
