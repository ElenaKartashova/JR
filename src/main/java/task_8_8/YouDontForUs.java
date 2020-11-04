package task_8_8;

//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.
//
//Требования:
//•	Программа не должна выводить текст на экран.
//•	Программа не должна считывать значения с клавиатуры.
//•	Класс Solution должен содержать только три метода.
//•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/
public class YouDontForUs {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> createSet = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            createSet.add(i);
        }
        return createSet;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();

            if (num > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
