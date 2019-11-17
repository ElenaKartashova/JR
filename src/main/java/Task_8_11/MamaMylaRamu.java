package Task_8_11;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */

/*
Омовение Рамы
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MamaMylaRamu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Character space = array[i];
            array[0] = Character.toUpperCase(array[0]);

            if (space.equals(' ')) {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
        }
        System.out.println(array);

    }
}
