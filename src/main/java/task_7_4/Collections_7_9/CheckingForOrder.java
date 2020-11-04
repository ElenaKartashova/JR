package task_7_4.Collections_7_9;

//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай 10 строк с клавиатуры и добавь их в список.
//•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

/*
Проверка на упорядоченность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckingForOrder {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String worlds = reader.readLine();
            list.add(worlds);
        }
        for (int i = 0, j = i + 1; i < list.size() - 1; i++, j++) {

            if (list.get(i).length() >= list.get(j).length()) {
                System.out.println(list.indexOf(list.get(j)));
                break;
            } else if (list.get(i).length() < list.get(j).length()) ;
        }
    }
}
