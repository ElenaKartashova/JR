package Task_7_4;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
//•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
//•	Должна быть выведена только одна строка.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/
public class TheMostTheMost {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> most = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            most.add(s);
        }
        int shortestString = most.get(0).length();
        int longestString = most.get(1).length();
        for (int i = 0; i < most.size(); i++) {
            if (most.get(i).length() < shortestString) {
                shortestString = most.get(i).length();
            }
        }
        for (int j = 0; j < most.size(); j++) {
            if (most.get(j).length() > longestString) {
                longestString = most.get(j).length();
            }
        }
        for (int i = 0; i < most.size(); i++) {
            if (most.get(i).length() == shortestString) {
                System.out.println(most.get(i));
                break;
            } else if (most.get(i).length() == longestString) {
                System.out.println(most.get(i));
                break;
            }
        }
    }
}

