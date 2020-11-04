package task_8_8;

//Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
//
//Требования:
//•	Не изменяй заголовок метода createSet().
//•	Программа не должна выводить текст на экран.
//•	Программа не должна считывать значения с клавиатуры.
//•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
//•	Множество из метода createSet() должно содержать 20 слов на букву «Л».

/*
20 слов на букву «Л»
*/

import java.util.HashSet;
import java.util.Set;

public class TwentyWordsPerLetterL {
    public static Set<String> createSet() {
        //напишите тут ваш код

        Set<String> createSet = new HashSet<String>();
        String l = "Л";
        for (int i = 0; i < 20; i++) {
            createSet.add(l + i);
        }
        return createSet;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
