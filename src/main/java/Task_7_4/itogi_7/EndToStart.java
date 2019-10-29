package Task_7_4.itogi_7;

//Ввести с клавиатуры 10 чисел и заполнить ими список.
//Вывести их в обратном порядке. Каждый элемент - с новой строки.
//Использовать только цикл for.
//
//Подсказка:
//Не забудь импортировать класс: java.util.ArrayList;
//
//Требования:
//•	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
//•	Считай 10 целых чисел с клавиатуры и добавь их в список.
//•	Выведи числа в обратном порядке.
//•	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Вывести числа в обратном порядке
*/
public class EndToStart {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(reader.readLine());
            numbers.add(n);
        }
        for (int j = numbers.size(); j > 0; j--) {
            System.out.println(numbers.get(j - 1));
        }

        for (int i : numbers) { //foreach
            System.out.println(i);
        }
    }
}
