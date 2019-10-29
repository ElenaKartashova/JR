package ru;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while.
  
Входные данные
Строка
6
MEDIUM
*/
public class CycleTwo {
    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int N = Integer.parseInt(reader.readLine());

        int a = 0;
        while (a < N) {
            System.out.println(str);
            a++;
        }
    }
}
